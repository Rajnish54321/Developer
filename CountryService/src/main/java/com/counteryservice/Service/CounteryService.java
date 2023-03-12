package com.counteryservice.Service;

import java.util.List;

import com.counteryservice.Entity.Countery;

public interface CounteryService {
	public List<Countery>getAllCountery();
	public Countery getCounteryById(long id);
	public Countery getCounteryByName(String countery );
	public Countery updateCountery(Countery countery);
	public void deleteCountery(long id);
	public Countery addCountery(Countery countery);

}
