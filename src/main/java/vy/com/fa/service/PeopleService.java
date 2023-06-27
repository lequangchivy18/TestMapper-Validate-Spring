package vy.com.fa.service;

import vy.com.fa.entity.People;

public interface PeopleService {
	void save(People people);
	
	People getPeopleById(String id);
	
	boolean existsById(String id);
}
