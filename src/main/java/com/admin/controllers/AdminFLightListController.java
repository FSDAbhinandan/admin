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
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("/flights/{id}")
	public void deleteFlight(@PathVariable("id") int id) {
		ResponseEntity<Void> deleteFlightById = template.exchange(
				"http://localhost:9092/flights"+"/"+"{id}",
		          HttpMethod.DELETE,
		          null,
		          void.class,
		          Integer.toString(id)
				);
	}
	
//	Block The Flight
	
	@PutMapping("/flights/{id}/block")
	public FlightList blockFlight(@PathVariable("id") int id) {
		System.out.println("Inside Admin ");
		ResponseEntity<FlightList> blockUnblock = template.exchange(
				"http://localhost:9092/flights"+"/"+"{id}"+"/block",
		          HttpMethod.PUT,
		          null,
		          FlightList.class,
		          Integer.toString(id)
				);
		return blockUnblock.getBody();
	}
	
	//UnBlock Flight
	@PutMapping("/flights/{id}/unblock")
	public FlightList unBlockFlight(@PathVariable("id") int id) {
		System.out.println("Inside Admin ");
		ResponseEntity<FlightList> blockUnblock = template.exchange(
				"http://localhost:9092/flights"+"/"+"{id}"+"/unblock",
		          HttpMethod.PUT,
		          null,
		          FlightList.class,
		          Integer.toString(id)
				);
		return blockUnblock.getBody();
	}
	
	
//	Edit flight
	
	@PutMapping("/flights/{id}/edit")
	public FlightList editFlight(@PathVariable("id") int id, @RequestBody FlightList flightList) {
		System.out.println("Inside Admin ");
		ResponseEntity<FlightList> blockUnblock = template.exchange(
				"http://localhost:9092/flights"+"/"+"{id}"+"/edit",
		          HttpMethod.PUT,
		          null,
		          FlightList.class,
		          Integer.toString(id)
				);
		return blockUnblock.getBody();
	}
}
