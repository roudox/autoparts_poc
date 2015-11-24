#SETUP

1. Install Firefox
2. Install Selenium IDE Plugin for Firefox
3. Create a test suite with a test case for an application
4. Install Eclipse IDE (Java Developer) Version
5. Create a new Maven Project in Eclipse
6. Add the following lines to pom.xml
```
<dependencies>
  	<dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>2.48.2</version>
    </dependency>  
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
``
7. Create a new Java class in 'src/test/java' dir
8. Download and install Android Studio: http://developer.android.com/sdk/index.html
9. cd /Users/nicholas.goolcharan/Library/Android/sdk/platform-tools<dependencies>
10.Run file: './adb devices'
11.Downlad and extract ChromeDriver to ~/Documents: http://chromedriver.storage.googleapis.com/index.html?path=2.13/
12.Go to cd ~/Documents
13.Run file: './chromedriver'

