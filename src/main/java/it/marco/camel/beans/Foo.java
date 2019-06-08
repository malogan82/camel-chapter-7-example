package it.marco.camel.beans;

import org.apache.camel.Exchange;

public class Foo {
	
	public void transform(Exchange exchange) {
		exchange.getIn().setBody(String.format("Bye %s", exchange.getIn().getBody(String.class)));
	}

}
