package it.marco.camel.route.builder;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:start").
			to("activemq:queue:foo?preserveMessageQos=true");
		
		from("activemq:queue:foo").
			transform(body().prepend("Bye "));
	    
		from("activemq:queue:bar?disableReplyTo=true").
			log("${body}");
	
	}

}
