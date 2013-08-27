gradle-im-notifier-plugin
=========================

Gradle plugin that adds the ability to automatically send an IM message using Google chat containing the build end status (success/failure).

You can take a look at the example repository for a simple usage sample or continue reading this file.

<b>Note:</b> This plugin supports Gradle 1.7 version (and probably above). 1.6 or earlier versions are not supported.  

Setup
-----

In order to use the plugin you need to perform the following steps:

1.  Clone this repository and run Gradle publish task:
  
  		./gradlew publish
  
    This command will create a jar file and publish it to lib folder and to your local Maven repository.

2.  Add the following lines to your build script:

    	apply plugin: 'im-notifier'

    	buildscript {
		repositories {
			mavenLocal()
		        mavenCentral()
	      	}

	      	dependencies {
		        classpath group: 'com.ka.gradle.plugin.notifier', name: 'im-notifier', version: '1.0'
	      	}
    	}
    
3.  Configure your Google chat client data:
    
    Google chat client can be configured by either placing a properties file in the root project or adding a configuration block in your build script.
    <b>In case both options are used, the values placed in the build script closure override the values in the properties file.</b>

    Whether you use a properties file or a closure, the following values need to be configured: 
    *    <b>sender.mail</b> - Google chat client mail address.
    *    <b>sender.password</b> - Google chat client password.
    *    <b>recipient</b> - Mail address of the recipient an IM message should be sent to.
    
    See the following sub sections for a detailed explanation for every option.

    ### Properties file
    Create a file called "im-notifier.properties" and place it in your root folder next to your build script. For example:
    
        sender.mail=[Place your sender gmail address in here]
        sender.password=[Place your sender password in here]
        recipient=[Place the recipient gmail address in here]
        
    ### Configuration block
    Add the following lines to your build script:
    
        imNotifier {
        	sender.mail=[Place your sender gmail address in here]
        	sender.password=[Place your sender password in here]
        	recipient=[Place the recipient gmail address in here]
        }

Usage
-----

The plugin adds a rule for sending notification message. Just add the word "notify" before the excuted task name and you are good to go.
For example, notifying execution of task "test" is achieved by running:

    gradle notifyTest
