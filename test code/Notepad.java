import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Notepad extends JFrame implements ActionListener  {
    
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu, formatMenu, helpMenu;
    private JMenuItem newItem, openItem, saveItem, saveAsItem, exitItem;
    private JMenuItem undoItem, redoItem, cutItem, copyItem, pasteItem, selectAllItem;
    private JMenuItem fontItem, wordWrapItem;
    private JMenuItem aboutItem;

    private File currentFile;
    private UndoManager undoManager;

    public Notepad() {
        initializeUI();
        setupMenubar();
        setupTextArea();
        setupUndoManager();

        setTitle("Notepad - Untitled");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeUI() {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setLayout(new BorderLayout());
    }

    private void setupMenubar() {
        menuBar = new JMenuBar();

        //file menu
        fileMenu = new JMenu("File");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        saveAsItem = new JMenuItem("Save As");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveAsItem.addActionListener(this);
        exitItem.addActionListener(this);

        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
            KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        //edit file
        editMenu = new JMenu("Edit");
        undoItem = new JMenuItem("Undo");
        redoItem = new JMenuItem("Redo");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        selectAllItem = new JMenuItem("Select All");

        undoItem.addActionListener(this);
        redoItem.addActionListener(this);
        cutItem.addActionListener(this);
        pasteItem.addActionListener(this);
        selectAllItem.addActionListener(this);

        undoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
        redoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK));
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        selectAllItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        
        editMenu.add(undoItem);
        editMenu.add(redoItem);
        editMenu.addSeparator();
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.addSeparator();
        editMenu.add(selectAllItem);

        //format menu 
        formatMenu = new JMenu("Format");
        wordWrapItem = new JMenuItem("Word Wrap");
        fontItem = new JMenuItem("Font");

        wordWrapItem.addActionListener(this);
        fontItem.addActionListener(this);

        formatMenu.add(wordWrapItem);
        formatMenu.add(fontItem);

        //help menu
        helpMenu = new JMenu("Help");
        aboutItem = new JMenuItem("About");

        aboutItem.addActionListener(this);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    private void setupTextArea() {
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setLineWrap(false);

        scrollPane = new JScrollPane(textArea,
        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        add(scrollPane, BorderLayout.CENTER);
    }

    private void setupUndoManager() {
        undoManager = new UndoManager();
        textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            newFile();
        }else if (e.getSource() == openItem) {
            openFile();
        }else if (e.getSource() == saveItem) {
            saveFile();
        }else if (e.getSource() == saveAsItem) {
            saveAsFile();
        }else if (e.getSource() == exitItem) {
            exit();
        }else if (e.getSource() == undoItem) {
            undo();
        }else if (e.getSource() == redoItem) {
            redo();
        }else if (e.getSource() == cutItem) {
            cut();
        }else if (e.getSource() == copyItem) {
            copy();
        }else if (e.getSource() == pasteItem) {
            paste();
        }else if (e.getSource() == selectAllItem) {
            selectAll();
        }else if (e.getSource() == wordWrapItem) {
            toggleWordWrap();
        }else if (e.getSource() == fontItem) {
            changeFont();
        }else if (e.getSource() == aboutItem) {
            showAbout();
        }
    }

    private void newFile(){
        if (textArea.getText().length()>0) {
            int response = JOptionPane.showConfirmDialog(this,
            "Save changes to current ?", "Notepad",
            JOptionPane.YES_NO_CANCEL_OPTION);
            
            if (response == JOptionPane.YES_OPTION) {
                saveFile();
                clearTextArea();
            } else if (response == JOptionPane.NO_OPTION) {
                clearTextArea();
            }
        } else {
            clearTextArea();
        }
    }

    private void clearTextArea() {
        textArea.setText("");
        currentFile = null;
        setTitle("Noteped Untitled");
        undoManager.discardAllEdits();
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open File");

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder content = new StringBuilder();
                String line;

                while ((line = reader.readLine()) !=null) {
                    content.append(line).append("\n");
                }

                textArea.setText(content.toString());
                currentFile = file;
                setTitle("Notepad - " + file.getName());
                undoManager.discardAllEdits();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                "Error reading file: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            saveAsFile();
        }else {
            try (BufferedWriter writer = new  BufferedWriter(new FileWriter(currentFile))) {
                writer.write(textArea.getText());
                setTitle("Notepad - " + currentFile.getName());

            }catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                "Error saving file: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveAsFile () {
        JFileChooser fileChooser =new JFileChooser();
        fileChooser.setDialogTitle("Save As");

        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            currentFile = file;
            saveFile();
        }
    }

    private void exit () {
        if (textArea.getText().length() > 0) {
            int response = JOptionPane .showConfirmDialog(this,
            "Save changes before exiting? ", "Notepad",
            JOptionPane.YES_NO_CANCEL_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                saveFile();
                System.exit(0);
            }else if (response == JOptionPane.NO_OPTION) {
                System.exit(0);
            }
        }else {
            System.exit(0);
        }
    }

    private void undo() {
        if ( undoManager.canUndo()) {
            undoManager.undo();
        }
    }

    private  void redo() {
        if (undoManager.canRedo()) {
            undoManager.redo();
        }
    }

    private void cut() {
        textArea.cut();
    }

    private void copy() {
        textArea.copy();
    }
    private void paste() {
        textArea.paste();
    }

    private void selectAll() {
        textArea.selectAll();
    }

    private void toggleWordWrap() {
        boolean wrap = !textArea.getLineWrap();
        textArea.setLineWrap(wrap);
        textArea.setWrapStyleWord(wrap);
        wordWrapItem.setText(wrap ? "Disabee Word Wrap" : "Word Wrap");
    }

    private void changeFont() {
        Font currentFont = textArea.getFont();
        Font newFont = (Font) JOptionPane.showInputDialog(this,
        "Choose font style:", "Font",
        JOptionPane.QUESTION_MESSAGE, null,
        new Font[]{
            new Font("Arial", Font.PLAIN, 14),
            new Font("Times New Roman", Font.PLAIN, 14),
            new Font("Courier New", Font.PLAIN, 14),
            new Font("Verdana", Font.PLAIN, 14)
            }, currentFont);
        
            if(newFont !=null) {
                textArea.setFont(newFont);
            }
        
    }

    private void showAbout() {
        JOptionPane.showMessageDialog(this, 
        "Simple Notepad Application\n"+
        "Create with Java Swimg\n" +
        "version 1.0" ,
        "About Notepad",
        JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void  run () {
                new Notepad();
            }
        });
    }

}