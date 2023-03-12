package com.counteryservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.counteryservice.Entity.Countery;
import com.counteryservice.Service.CounteryService;

import jakarta.websocket.server.PathParam;

@RestController
public class CounteryController {
	@Autowired
	public CounteryService counteryService;

	@GetMapping("/getcountery")
	public List<Countery> getCounteries() {
		return counteryService.getAllCountery();
	}

	@GetMapping("/getcountery/{id}")

	public ResponseEntity<Countery> getCounteryById(@PathVariable(value = "id") Long id) {
		try {
			Countery countery = counteryService.getCounteryById(id);
			return new ResponseEntity<Countery>(countery, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Countery>(HttpStatus.NOT_FOUND);

		}

	}

	@GetMapping("/getcountery/{CounteryName}")
	public ResponseEntity<Countery> getCounteryByName(@PathParam(value = "CounteryName") String CounteryName) {
		try {
			Countery countery = counteryService.getCounteryByName(CounteryName);
			return new ResponseEntity<Countery>(countery, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Countery>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/addcountery")
	public Countery addCountery(@RequestBody Countery countery) {
		return counteryService.addCountery(countery);
	}

	@PostMapping("updatecountry")
	public ResponseEntity<Countery> updateCountery(@PathVariable(value = "id") Long id,
			@RequestBody Countery countery) {
		try {
			Countery existCountery = counteryService.getCounteryById(id);
			existCountery.setCountryName(countery.getCountryName());
			existCountery.setCountryCapital(countery.getCountryCapital());
			Countery update_Countery = counteryService.updateCountery(existCountery);
			return new ResponseEntity<Countery>(update_Countery, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Countery>(HttpStatus.CONFLICT);
		}

	}

	@DeleteMapping("/deleted/{id}")
	public ResponseEntity<Countery> deleteCountery(@PathVariable(value="id")long id) {
		counteryService.deleteCountery(id);
		return new ResponseEntity<Countery>(HttpStatus.OK);

		
	}

}
