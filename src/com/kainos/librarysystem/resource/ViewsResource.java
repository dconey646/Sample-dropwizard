package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.DecideSearchType;
import com.kainos.librarysystem.views.Index;

@Path("/")
public class ViewsResource {
	
	private final String template;
	private final String defaultName;
	
	public ViewsResource(String template, String defaultName){
		this.template = template;
		this.defaultName = defaultName;
	}
	
	
	
	@POST
	@Timed
	@Path("/login-details")
	@Produces(MediaType.TEXT_HTML)
	/**
	 * Will call the method to decide which
	 * type of search query to use
	 * @param searchString
	 * @param searchType
	 * @return
	 */
	public View loginDetails(@FormParam("SearchString") String searchString,
			@FormParam("SearchType") String searchType) {
		//call query tpye method
		DecideSearchType.CallQuery(searchString, searchType);
	

	}

}
