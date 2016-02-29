package cz.tomascejka.learn.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client implements HelloWorldWs {

	private HelloWorldWs helloWorldWs;
	
    /**
     * Default constructor
     * 
     * @param url The URL to the Hello World WSDL endpoint.
     */
    public Client(final URL wsdlUrl) {
        QName serviceName = new QName("http://tomascejka.eu/ws/HelloWorld", "HelloWorldService");

        Service service = Service.create(wsdlUrl, serviceName);
        helloWorldWs = service.getPort(HelloWorldWs.class);
        assert (helloWorldWs != null);
    }
    
    /**
     * Default constructor
     * 
     * @param url The URL to the Hello World WSDL endpoint.
     * @throws MalformedURLException if the WSDL url is malformed.
     */
    public Client(final String url) throws MalformedURLException {
        this(new URL(url));
    }

    /**
     * Gets the Web Service to say hello
     */
	@Override
	public String getHelloWorld(String name) {
		return helloWorldWs.getHelloWorld(name);
	}

}
