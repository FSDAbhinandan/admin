package com.admin.controllers;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admin.entity.FlightList;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminFLightListController {
	
	RestTemplate template = new RestTemplate();
	

	@GetMapping("/flights")
	public List<FlightList> getAllFlights(){
		ResponseEntity<List<FlightList>> flightList = template.exchange(
				          "http://localhost:9092/flights",
				          HttpMethod.GET,
				          null,
				          new ParameterizedTypeReference<List<FlightList>>() {
						});
		System.out.println("Admin Getting flight is runninkg");
		
		return flightList.getBody();
	}
	
	//Adding Flights
	
	@PostMapping("/flights")
	public FlightList saveFlight(@RequestBody FlightList flightList) {
		FlightList flight = template.postForObject(
				               "http://localhost:9092/flights",
				               flightList,
				               FlightList.class
				               );
		System.out.println("Admin adding flights");
		return flight;
	}
	
	//Deleting Flight By Id
	
	@DeleteMapping("flights/{id}")
	public void deleteFlight(@PathVariable("id") int id) {
		ResponseEntity<Void> deleteFlightById = template.exchange(
				"",
		          HttpMethod.DELETE,
		          null,
		          void.class,
		          Integer.toString(id)
				);
	}
}
