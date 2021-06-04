package com.sapient.byrajan.fbleague.controller;

import com.sapient.byrajan.fbleague.exceptionhandler.ResourceNotFoundException;
import com.sapient.byrajan.fbleague.exceptionhandler.StandingServiceException;
import com.sapient.byrajan.fbleague.service.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This is controller class
 *
 * @author Rajan
 */
@Controller
@RequestMapping("/v1")
public class FBLeagueController {
	
	@Value( "${standings.endpoint}" )
	private String apiURL;
	
	@Value( "${api.key}" )
	private String apiKey;
	
	@Autowired
	private RestClient restClient;

	@RequestMapping(value="/getStandings", method=RequestMethod.GET)
	public ResponseEntity<String> getStandingsOfTeams() throws ResourceNotFoundException, StandingServiceException {
		try{
			String result = restClient.getResponse(apiURL + apiKey);
			if (result == null) {
				throw new ResourceNotFoundException("No Standings found for requested combination.");
			}

			return ResponseEntity.ok(result);

		}catch(Exception z){
			throw new StandingServiceException("Error occured while calling external service.");
		}
	}

}
