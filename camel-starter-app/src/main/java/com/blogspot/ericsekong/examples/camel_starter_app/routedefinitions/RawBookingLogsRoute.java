package com.blogspot.ericsekong.examples.camel_starter_app.routedefinitions;

import org.apache.camel.builder.RouteBuilder;

public class RawBookingLogsRoute extends RouteBuilder{

	
	String sourceEndpoint = "direct:a";
	String desinationEndpoint = "direct:b";
	
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("direct:a")
			.to("direct:b")
			.end();
		
	
		
	}

}
