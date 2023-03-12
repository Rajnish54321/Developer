package com.counteryservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.counteryservice.Entity.Countery;
import com.counteryservice.Repository.CountryRepository;

@Service
public class CounteryServiceImpl implements CounteryService {
	@Autowired
	public CountryRepository countryRepository;

	@Override
	public List<Countery> getAllCountery() {

		return countryRepository.findAll();
	}

	@Override
	public Countery getCounteryById(long id) {

		return countryRepository.findById(id).get();
	}

	@Override
	public Countery getCounteryByName(String CounteryName) {
		List<Countery> countries = countryRepository.findAll();
		Countery countery = null;
		for (Countery con : countries) {
			if (con.getCountryName().equalsIgnoreCase(CounteryName))
				countery = con;

		}

		return countery;
	}

	public int getMaxId() {
		return countryRepository.findAll().size() + 1;
	}

	@Override
	public Countery updateCountery(Countery countery) {

		countryRepository.save(countery);
		return countery;
	}

	@Override
	public void deleteCountery(long id) {
		countryRepository.deleteById(id);

	}

	@Override
	public Countery addCountery(Countery countery) {
		
		return countryRepository.save(countery);
	}

}
