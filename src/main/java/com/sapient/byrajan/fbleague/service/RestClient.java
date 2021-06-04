package com.sapient.byrajan.fbleague.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Call external rest end point and
 * send the returned data to the controller.
 *
 * @author Rajan
 */
@Service
public class RestClient {

	Logger logger = LoggerFactory.getLogger(RestClient.class);

	public String getResponse(final String url){

		RestTemplate restTemplate = new RestTemplate();

		logger.info("calling external rest end to get standing of teams : ");
	    return restTemplate.getForObject(url, String.class);
	}

}
