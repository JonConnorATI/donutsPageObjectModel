# donutsPageObjectModel
This is a TestNG framework that I've created to help anyone interested in UI Automation testing.

I chose this web site as it has some good features to practice on. Also, it is a bit temperamental when switching between pages so the tests have to be robust and able to handle behaviour that may or may not happen. All good fun.

If you don't know anything about java and selenium, by all means have a look in this repository, clone it and have a play around. If you would like some learning resources, this free course on [Udemy](https://www.udemy.com/course/automateseleniumusingjava/) is where I started.

There's also a project I created with the same tests but using Cucumber rather than TestNG. [View it here in GitHub](https://github.com/JonConnorATI/donuts)
  

## What is this repository for? ###
Practicing UI automation 

## What you will need
* Jdk 18 [Download](https://adoptium.net/en-GB/temurin/releases/?version=18)

* Maven latest version [Download](https://maven.apache.org/download.cgi) & [How to install](https://maven.apache.org/install.html)

Once installed verify your version by running the following commands in your terminal:  
    
    java --version
    mvn --version

## IDE
You will need an editor to use the Framework. There are loads out there. My personal preference is Eclipse, but feel free to use whatever editor you are most comfortable with. VS Code doesn't have a solution to use the TestNG xml file but you can still run the tests.

* Eclipse [Download](https://www.eclipse.org/downloads/packages/release/luna/sr2/eclipse-ide-java-developers)

* VS Code [Download](https://code.visualstudio.com/download)

## How do I get set up? ###

Clone the repository, to a folder in your machine [See Instructions here if you're not familiar](https://docs.github.com/en/desktop/contributing-and-collaborating-using-github-desktop/adding-and-cloning-repositories/cloning-and-forking-repositories-from-github-desktop)
		

<ul>
	<li>For VS Code</li><br>
		<ul>
			<li>From VS Code open the Folder containing the framework</li><br>
			<li>From the Extensions | <a href="https://code.visualstudio.com/docs/editor/extension-marketplace" target="_blank">Help</a></li><br>
				<ul>
					<li>ensure that "Extension Pack for Java" is installed. This includes 6 extensions that are needed to run the tests</li><br>	
				</ul>
			<li>If there are any issues run "java:Clean Java Language Server Workspace" in the Command Palette | <a href="https://code.visualstudio.com/api/ux-guidelines/command-palette" target="_blank">Help</a></li><br>
		</ul>
	<li>For Eclipse</li><br>
		<ul>
		<li>From the menu bar in Eclipse select File>Open Projects from File System ...>Directory>Find the folder this project is in>Select Folder>Finish</li><br>
		<li>You'll need to install a plug in "TestNG for Eclipse" | <a href="https://www.eclipse.org/community/eclipse_newsletter/2017/february/article7.php" target="_blank">Help</a></li><br>
		</ul>
</ul>

The POM.xls file included in the repository has all the other plug ins and dependencies required, however you may need to force the install.

<ul>
	<li>In VS Code</li><br>
		<ul>
			<li>Go to View>Command Pallete>Search for "java:Clean Java Language Server Workspace" confirm you want it run.</li><br>
			<li>The project will reset and at the bottom of the Explorer tab there should be a tab "Maven" Open this select Lifecycle>Clean then when that's finished, Lifecycle>Install.</li><br>
		</ul>
	<li>In Eclipse</li><br>
		<ul>
			<li>Go to the pom.xml file, right click it and select Maven>Update Project>tick Force update of snapshots>OK.</li><br>
			<li>When that has finished right click the pom.xml file again and select Run As>Maven Clean then when that's finished Run As>Maven Install.</li><br>
		</ul> 
</ul>

## Do I need to download a WebDriver?
No, this framework uses the plug in [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)

WebDriverManager is an open-source Java library that carries out the management (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.) in a fully automated manner. 

## Project Folder Structure
I have structured the framework like this:

* `src/main/java`: This is the root directory for our source code. It contains the Base Methods (Starting the Driver, opening the browser), Common Methods (Click, wait for an element to be present) which are methods that we would constantly be calling in our code, so we put them in one place so we don't have to keep writing them every time we need them, and finally the page methods which are specific to the page you are testing.
 

* `src/main/test`: This is root directory for our test code. Keep your tests here.

## How it works
Once we've written all the steps in the test file and Page Methods we need a Test Runner. We specify in this Runner which tests to run and the folder where the tests are. The runner is an xml file. In this project its called `testng.xml`

![alt text](Resources/TestRunner.png) 

The test runner is needed to run the tests, the way its set now it will run all the tests in the tests folder.

`<include name = ..../> means it will run.`
`<exclude name = .../> means it will not run.` 

We can be more specific by using tags. If we just want the features to run that are tagged with certain text, for example @regression then set the tag in the test runner.

There are many more ways to set the runner. Here is a great resource that has more information | [TestNG Information](https://testng.org/doc/eclipse.html)

So once the runner is set up to kick off a run:

* In VS code, as mentioned, TestNG isn't available but you can still run the tests. Select the testing icon then play on the test

![alt text](Resources/startTest.PNG) 

* In Eclipse, right click the testng.xml file then Run as TestNG suite

![alt text](Resources/RunTest.PNG)

* Also in Eclipse, when you annotate a testing script with @Test it imports TestNG features, so that you can run all the tests in the file, or just one test in the file

![alt text](Resources/TestNGRunTestPNG.PNG)

The project is set to run 'headless' [(More Information here)](https://smartbear.com/blog/selenium-tests-headless/) which means you wont see the browser window. If you want to run it in your browser window, simply comment out the `ops.addArguments("--headless");` line in the `BasePage.java` file like so,

![alt text](Resources/Headless.png)

## What Next
I hope this has been helpful and you've successfully installed and ran the tests. You can now point this framework at any web site and automate tests by writing your own test files and page methods.

If you get stuck there's unlimited resources to tap into on the web. A big part of becoming an automation test engineer is finding out how to do things yourself. I come across automation scenarios every day where I don't know what to do to overcome an issue, so I just type `Selenium Java ....my issue...` into a google search, there's usually hundreds of others who've had the same problem.

:bulb: Top tip

If you are trying to fix something, keep your original code by commenting it out, and writing your new solution directly underneath, don't delete the original code. You might need to go back to it. The number of times I've deleted something then ended up having to write it all again .... save yourself some pain.

Good luck and happy testing !!!!!! :thumbsup: <br><br><br>
