package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.views.Index;

@Path("/hello-world")
public class ViewsResource {
	
	private final String template;
	private final String defaultName;
	
	public ViewsResource(String template, String defaultName){
		this.template = template;
		this.defaultName = defaultName;
	}
	
	@GET
	@Timed
	@Path("/hello")
	@Produces(MediaType.TEXT_HTML)
	public View sayHello(){
		return new Index();
	}

}
