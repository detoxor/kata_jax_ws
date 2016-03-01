# kata_jax_ws
Simple java web service SOAP project

## Official
* https://jax-ws.java.net/nonav/jaxws-api/2.2/index.html
* http://jcp.org/en/jsr/detail?id=224 << SPEC
* https://jax-ws.java.net/nonav/2.2.10/docs/index.html
* https://jax-ws.java.net/nonav/2.2.10/docs/release-documentation.html (single html)
* https://jax-ws.java.net/articles.html
* https://docs.jboss.org/author/display/WFLY8/JAX-WS+User+Guide

## Testing
* __http://www.slideshare.net/reza_rahman/javaee-testing__ << HOT
* http://www.paluch.biz/blog/53-unit-testing-of-web-services-with-junit-soap-services.html
* https://www.javacodegeeks.com/2014/06/java-ee7-and-maven-project-for-newbies-part-5-unit-testing-using-arquillian-wildfly-8.html << WILDFLY && ARQUILLIAN WS
* http://antoniogoncalves.org/2012/10/24/no-you-dont-need-to-mock-your-soap-web-service-to-test-it/ << PIS SOAP Servise jednoduche a muze je testovat jako pojo
* https://web-gmazza.rhcloud.com/blog/entry/junit-web-service-testing
* http://olafsblog.sysbsb.de/lightweight-testing-of-webservice-http-clients-with-junit-and-jetty/
* http://tomee.apache.org/examples-trunk/simple-webservice/README.html
* https://thomassundberg.wordpress.com/2011/11/16/testing-a-web-service-with-soapui-junit-maven-and-cucumber/
* https://wiki.kuali.org/display/KULRICE/Unit+Testing+JAX-WS+Services
* http://ojitha.blogspot.cz/2012/01/saaj-unit-testing-client-for-jax-ws-web.html

## Examples
* https://github.com/sgilda/wildfly-quickstart/tree/master/helloworld-ws << ZDROJ
* http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/ << ZDROJ
* http://www.benchresources.net/jax-ws-based-soap-web-service-jargons/ << README
* https://axis.apache.org/axis2/java/core/docs/jaxws-guide.html << README
* http://docs.oracle.com/javaee/7/tutorial/jaxws.htm#BNAYL
* http://docs.oracle.com/javaee/6/tutorial/doc/bnayl.html
* http://docs.oracle.com/javase/7/docs/technotes/guides/xml/jax-ws/
* https://github.com/sgilda/wildfly-archetypes/blob/master/wildfly-javaee7-webapp-ear-archetype/
* https://github.com/sgilda/wildfly-quickstart/blob/master/hibernate4/
* https://jax-ws.java.net/articles/handlers_introduction.html
* http://www.jboss.org/ticket-monster/datapersistence/ MUSTREAD

## Guides
* http://www.javatpoint.com/jax-ws-tutorial << STUDY
* https://mytechprep.wordpress.com/category/soap/ << STUDY
* http://web-gmazza.rhcloud.com/blog/entry/jaxws-handler-tutorial
* http://itdoc.hitachi.co.jp/manuals/3020/30203Y2310e/EY230815.HTM << STUDY SOAP HANDLER CHAIN
* https://docs.oracle.com/cd/E13222_01/wls/docs103/webserv_adv_rpc/handlers.html << STUDY SOAP HANDLE CHAIN
* http://itdoc.hitachi.co.jp/manuals/3020/30203Y2310e/EY230011.HTM
* http://www.javaworld.com/article/2077679/soa/get-a-handle-on-the-jax-ws-api-s-handler-framework.html
* http://www.java-forums.org/ocpjwsd/56130-tutorial-review-jax-ws-server-side-web-service-developer-exam-ii.html << STUDY SOAP FAULT PROCESSING
* http://www.java-forums.org/ocpjwsd/55944-tutorial-review-jax-ws-server-side-web-services-developer-exam.html << STUDY
* http://www.java-forums.org/ocpjwsd/56736-review-web-service-security.html << STUDY
* https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-security-example/
* https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-annotations-example/ << STUDY @annotation
* __http://www.java-forums.org/ocpjwsd/__ << STUDY
* http://www.intertech.com/Blog/java-soap-with-attachments-api-and-some-interesting-xml-tools/


## JAX-WS Security
* https://www-01.ibm.com/support/knowledgecenter/SS7JFU_8.5.5/com.ibm.websphere.nd.doc/ae/cwbs_wss_api.html
* http://www.capcourse.com/News/20090818.html
* http://www.javaworld.com/article/2073287/soa/secure-web-services.html?page=2


## SOAP vs LOGICAL handlers
"JAX-WS supports two types of SOAP message handlers: SOAP handlers and logical handlers. SOAP handlers can access the entire SOAP message, including the message headers and body. Logical handlers can access the payload of the message only, and cannot change any protocol-specific information (like headers) in a message."

* http://learningviacode.blogspot.cz/2014/03/the-different-type-of-jax-ws-handlers.html
* http://itdoc.hitachi.co.jp/manuals/3020/30203Y2310e/EY230814.HTM
