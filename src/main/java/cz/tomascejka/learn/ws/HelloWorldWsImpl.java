package cz.tomascejka.learn.ws;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService(serviceName = "HelloWorldService", portName = "HelloWorld", name = "HelloWorld", endpointInterface="cz.tomascejka.learn.ws.HelloWorldWs")
public class HelloWorldWsImpl implements HelloWorldWs {

	private static final Logger log = LoggerFactory.getLogger(HelloWorldWsImpl.class);
	
	@Override
	public String getHelloWorld(String name) {
		log.info("INCOMING RQS: {}", name);
		return "Hello world "+name;
	}

}
