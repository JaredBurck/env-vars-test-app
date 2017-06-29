# env-vars-test-app
A Java ReST application the returns the environment variables

env-vars-test-app using JAX-RS (Java API for RESTful Web Services)

==========================================================================
Author: Jared Burck
Level: Intermediate  
Technologies: CDI, JAX-RS  
Summary: The `env-vars-app` quickstart demonstrates a simple rest application, bundled and deployed as a WAR, that uses *JAX-RS* to get system environment variables.    
Target Product: JBoss EAP 6
Source: <https://github.com/jaredburck/env-vars-test-app>  
==========================================================================

What is it?
-----------

The `env-vars-app` quickstart demonstrates the use of *CDI 1.0* and *JAX-RS* in Red Hat JBoss Enterprise Application Platform.


System requirements
-------------------

The application this project produces is designed to be run on Red Hat JBoss Enterprise Application Platform 6.1 or later.

All you need to build this project is Java 6.0 (Java SDK 1.6) or later, Maven 3.0 or later.


Configure Maven
---------------

If you have not yet done so, you must [Configure Maven](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/CONFIGURE_MAVEN.md#configure-maven-to-build-and-deploy-the-quickstarts) before testing the quickstarts.


Use of EAP_HOME
---------------

In the following instructions, replace `EAP_HOME` with the actual path to your JBoss EAP 6 installation. The installation path is described in detail here: [Use of EAP_HOME and JBOSS_HOME Variables](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/USE_OF_EAP_HOME.md#use-of-eap_home-and-jboss_home-variables).


Start the JBoss EAP Server
-------------------------

1. Open a command prompt and navigate to the root of the JBoss EAP directory.
2. The following shows the command line to start the server:

        For Linux:   EAP_HOME/bin/standalone.sh
        For Windows: EAP_HOME\bin\standalone.bat


Build and Deploy the Quickstart
-------------------------

_NOTE: The following build command assumes you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Build and Deploy the Quickstarts](https://github.com/jboss-developer/jboss-developer-shared-resources/blob/master/guides/BUILD_AND_DEPLOY.md#build-and-deploy-the-quickstarts) for complete instructions and additional options._

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command prompt and navigate to the root directory of this quickstart.
3. Type this command to build and deploy the archive:

        mvn clean install jboss-as:deploy

4. This will deploy `target/env-vars-app.war` to the running instance of the server.


Access the application
---------------------

The application is deployed to <http://localhost:8080/env-vars-app>.

The *XML* content can be viewed by accessing the following URL: <http://localhost:8080/env-vars-app/rest/xml>

The *JSON* content can be viewed by accessing this URL: <http://localhost:8080/env-vars-app/rest/json>


Undeploy the Archive
--------------------

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command prompt and navigate to the root directory of this quickstart.
3. When you are finished testing, type this command to undeploy the archive:

        mvn jboss-as:undeploy


Debug the Application
------------------------------------

If you want to debug the source code of any library in the project, run the following command to pull the source into your local repository. The IDE should then detect it.

        mvn dependency:sources
