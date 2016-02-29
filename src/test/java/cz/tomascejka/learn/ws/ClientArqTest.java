package cz.tomascejka.learn.ws;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
* Simple set of tests for the HelloWorld Web Service to demonstrate accessing the web service using a client
* 
* @see https://github.com/sgilda/wildfly-quickstart/blob/master/helloworld-ws/src/main/java/org/jboss/as/quickstarts/wshelloworld/HelloWorldServiceImpl.java
*/
@RunWith(Arquillian.class)
public class ClientArqTest {
   /**
    * The location of the WebApp source folder so we know where to find the web.xml when deploying using Arquillian.
    */
   private static final String WEBAPP_SRC = "src/main/webapp";
   /**
    * The name of the WAR Archive that will be used by Arquillian to deploy the application.
    */
   private static final String APP_NAME = "jboss-as-helloworld-ws";
   /**
    * The path of the WSDL endpoint in relation to the deployed web application.
    */
   private static final String WSDL_PATH = "HelloWorldService?wsdl";

   @ArquillianResource
   private URL deploymentUrl;

   private HelloWorldWs client;

   @Deployment(testable = false)
   public static WebArchive createDeployment() {
       WebArchive archive = ShrinkWrap.create(WebArchive.class, APP_NAME + ".war")
    		   .addPackage(HelloWorldWs.class.getPackage())
               .addAsWebInfResource(new File(WEBAPP_SRC, "WEB-INF/web.xml"));
	return archive;
   }

   @Before
   public void setup() {
       try {
           client = new Client(new URL(deploymentUrl, WSDL_PATH));
       } catch (MalformedURLException e) {
           e.printStackTrace();
       }
   }

   @Test
   public void testHello() {
       System.out.println("[Client] Requesting the WebService to say Hello.");

       // Get a response from the WebService
       final String response = client.getHelloWorld("Tomas");
       assertEquals(response, "Hello world Tomas");
       System.out.println("[WebService] " + response);
   }
}
