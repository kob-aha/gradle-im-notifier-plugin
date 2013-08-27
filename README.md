gradle-im-notifier-plugin
=========================

Gradle plugin that adds the ability to automatically sends an IM message using Google chat containing the build end status (success/failure).

See the example repository for a simple usage sample or continue reading this file.

Usage
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

3.1  properties file

