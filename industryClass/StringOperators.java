public class StringOperators {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + str1.concat(" ").concat(str2));
        System.out.println();
        // Length
        System.out.println("Length of"+ str1+": " + str1.length());
        System.out.println();
        // Character at index
        System.out.println("Character at index 1 of "+ str2+": " + str2.charAt(1));
        System.out.println();
        // Substring
        System.out.println("Substring of "+str1+" from index 1 to 4: " + str1.substring(1, 4));
        System.out.println();
        // Replace
        System.out.println("Replace 'l' with 'x' in "+str1+": " + str1.replace('l', 'x'));
        System.out.println("Replace 'l' with 'x' in "+str2+": " + str2.replace("World", "1x1x1x1"));
        System.out.println();
        // To Upper Case
        System.out.println(str2+" in upper case: " + str2.toUpperCase());
        System.out.println();
        // To Lower Case
        System.out.println(str1+" in lower case: " + str1.toLowerCase());
        System.out.println();
        // Trim
        String str3 = "   Trim me   ";
        System.out.println("Trimmed string: '" + str3.trim() + "'");
        System.out.println();
        // Contains
        System.out.println("Does "+str1+" contain 'lo'? " + str1.contains("lo"));
        System.out.println();
        // Equals
        System.out.println("Is "+str1+" equal to 'Hello'? " + str1.equals("Hello"));
        System.out.println();
        // Is Empty
        String str4 = "";
        System.out.println("Is str4 empty? " + str4.isEmpty());
        System.out.println("Is "+str1+" empty? " + str1.isEmpty());
        System.out.println();
        // Split
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        // Index Of
        System.out.println("Index of 'o' in "+str2+": " + str2.indexOf('o'));
        System.out.println();
        // Last Index Of
        System.out.println("Last index of 'l' in "+str1+": " + str1.lastIndexOf('l'));
        System.out.println();
        // Starts With
        System.out.println("Does "+str1+" start with 'He'? " + str1.startsWith("He"));
        System.out.println();
        // Ends With
        System.out.println("Does "+str2+" end with 'ld'? " + str2.endsWith("ld"));
        System.out.println();
        // Format
        String formatted = String.format("Formatted string: %s - %s", str1, str2);
        System.out.println(formatted);
        System.out.println();
        // Compare To
        System.out.println("Comparing "+str1+" to 'Hello': " + str1.compareTo("Hello"));
        System.out.println("Comparing "+str1+" to "+str2+": " + str1.compareTo(str2));
        System.out.println("Comparing "+str2+" to "+str1+": " + str2.compareTo(str1));
        System.out.println("Comparing "+str1+" to 'Apple': " + str1.compareTo("Apple"));
        System.out.println("Comparing "+str2+" to 'Zebra': " + str2.compareTo("Zebra"));
        System.out.println("Comparing "+str1+" to 'hello' (case-sensitive): " + str1.compareTo("hello"));
        System.out.println("Comparing "+str1+" to 'hello' (case-insensitive): " + str1.compareToIgnoreCase("hello"));
        System.out.println("Comparing "+str2+" to 'WORLD' (case-insensitive): " + str2.compareToIgnoreCase("WORLD"));
        System.out.println("Comparing "+str1+" to an empty string: " + str1.compareTo(""));
        System.out.println("Comparing two empty strings: " + "".compareTo(""));
        System.out.println("Comparing "+str1+" to itself: " + str1.compareTo(str1));
        System.out.println();
        // Repeat
        System.out.println(str1+" repeated 3 times: " + str1.repeat(3));
        System.out.println();
        // Join
        String joined = String.join(" - ", str1, str2, "Java");
        System.out.println("Joined string: " + joined);
        System.out.println();
        // Escape Sequences
        String withEscapes = "Line1\nLine2\tTabbed\bBackspace\rCarriageReturn\fFormFeed\'SingleQuote\"DoubleQuote\\Backslash";
        System.out.println("String with escape sequences:");
        System.out.println(withEscapes);
        System.out.println();
        // Value Of
        int number = 100;
        System.out.println("String value of number 100: " + String.valueOf(number));
        System.out.println();
        // convert int to string
        int num = 123;  
        String numStr = Integer.toString(num);
        System.out.println("Integer to String: " + numStr);
        System.out.println();
        // convert string to int
        String strNum = "456";
        int parsedNum = Integer.parseInt(strNum);
        System.out.println("String to Integer: " + parsedNum);
        System.out.println();
        // Check if string is palindrome
        String palindrome = "madam";    
        String reversed = new StringBuilder(palindrome).reverse().toString();
        boolean isPalindrome = palindrome.equals(reversed);
        System.out.println("Is '"+palindrome+"' a palindrome? " + isPalindrome);
    }
}
