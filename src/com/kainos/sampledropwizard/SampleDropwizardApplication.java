package com.kainos.sampledropwizard;

import com.kainos.sampledropwizard.configuration.SampleDropwizardConfiguration;
import com.kainos.sampledropwizard.resource.SampleDropwizardResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class SampleDropwizardApplication extends Application<SampleDropwizardConfiguration> {
	
	public static void main(String[] args) throws Exception {
		new SampleDropwizardApplication().run(args);
	}

	@Override
	public void run(SampleDropwizardConfiguration configuration, Environment environment)
			throws Exception {
		final SampleDropwizardResource resource = new SampleDropwizardResource(
				configuration.getTemplate(), configuration.getDefaultName()
				);
		environment.jersey().register(resource);
	}
	
	@Override
	public String getName(){
		return "hello-world";		
	}
	
	@Override
	public void initialize(Bootstrap<SampleDropwizardConfiguration> bootstrap){
	}

}
