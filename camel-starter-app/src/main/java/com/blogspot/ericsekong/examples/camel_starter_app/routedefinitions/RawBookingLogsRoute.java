package com.blogspot.ericsekong.examples.camel_starter_app.routedefinitions;

import org.apache.camel.builder.RouteBuilder;

public class RawBookingLogsRoute extends RouteBuilder {

	String sourceEndpoint = "direct:a";
	String processingEndpoint = "direct:b";
	String insertSingleBooking = "mybatis-sqlserver-prod:insertBookingData";
	String selectRecentBookings = "mybatis-sqlserver-prod:selectRecentBookingData";
	String updateBooking = "mybatis-sqlserver-prod:updateBookingData";

	@Override
	public void configure() throws Exception {

		from("direct:a") 
		.to("log:out")
		// other processors
		.to(insertSingleBooking).end();
		
		
		// Load in recent transactions and provide them to a camel route
		
		from(selectRecentBookings)
			.split(body())
			// other processing
			.to(updateBooking).end();
		
	}
}
