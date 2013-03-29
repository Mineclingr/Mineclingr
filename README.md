Mineclingr
======================
### Modding Preparation ###
	$ cd [ANYWHERE]
	$ wget http://files.minecraftforge.net/minecraftforge/minecraftforge-src-recommended.zip
	$ unzip minecraftforge-src-recommended.zip  
	$ sh install.sh
	#do not root install !!
	$ cd mcp/src/
	$ git init
	$ mv -f forge/* .
	$ rm -r forge
	$ sh install.sh
	$ git init
	$ git remote add origin git@github.com:Mineclingr/Mineclingr.git
	$ git pull origin master

