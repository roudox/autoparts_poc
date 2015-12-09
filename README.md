#FIREFOX - INSTALL

1. go to url: https://www.mozilla.org/
2. download latest version of firefox
3. find and locate file on local machine
4. install firefox file

#FIREFOX - SELENIUM IDE PlUGING INSTALL

1. go to url: http://www.seleniumhq.org/download/
2. search for text: Selenium IDE
3. click on link for latest release version
4. follow prompts on firefox to install Selenium IDE plugin
5. restart firefox
6. on firefox toolbar, there should be a Selenium IDE plugin icon after successful installation

#ANDROID STUDIO - INSTALL

1. go to url: http://developer.android.com/sdk/index.html
2. click on download link
3. download Android Studio
4. install Android Studio

#CHROME DRIVER - INSTALL

1. go to url: http://chromedriver.storage.googleapis.com/index.html?path=2.13/
2. download Chrome Driver
3. extract file to ~/Sites directory

#ECLIPSE - INSTALL

1. go to url: https://eclipse.org/downloads/
2. search for text: Eclipse IDE for Java EE Developers 
3. click on link associated to text above
4. download file
5. find and locate file on local machine
6. install: Eclipse IDE for Java EE Developers 

#CREATE A GIT HUB ACCOUNT

1. go to: https://github.com/join
2. follow steps to create a personal account, not corporate
3. login to your new personal account

#CLONE THIS REPO ON YOUR LOCAL MACHINE

1. open terminal
2. navigate to a directory where this code will live eg. 'cd ~/Sites'
3. run command: git clone https://github.com/roudox/autoparts_poc.git

#IMPORT THIS MAVEN PROJECT

1. open Eclipse IDE
2. click: File>Import
3. click: > Maven, to expand hidden elements
4. click: Existing Maven Projects
5. browse for Maven Project by finding root folder of this Repo
6. select this Repo's root folder
7. click: Next
8. click: Finish
9. this Repo should now be visible on left pane, within "Project" pane

#CONFIGURE ANDROID DEVICE

1. connect an android device via USB to machine
2. navigate to: Settings>Developer Options
3. locate: USB Debugging option
4. Turn On option for USB Debugging

"USB Debugging" set to true
9. Connect Android Device to Machine via usb
10. Download and install Android Studio: http://developer.android.com/sdk/index.html
11. cd /Users/nicholas.goolcharan/Library/Android/sdk/platform-tools<dependencies>
12.Run file: './adb devices'
13.Downlad and extract ChromeDriver to ~/Documents: http://chromedriver.storage.googleapis.com/index.html?path=2.13/
14.Go to cd ~/Documents
15.Run file: './chromedriver'

