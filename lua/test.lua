git clone https://github.com/actboy168/luamake
pushd luamake
git submodule init
git submodule update
.\compile\install.bat(msvc)
./compile/install.sh (other)
popd
