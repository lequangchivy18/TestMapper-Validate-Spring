package vy.com.fa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import vy.com.fa.entity.People;
import vy.com.fa.repository.PeopleRepository;
import vy.com.fa.service.PeopleService;
@Service
public class PeopleServiceImpl implements PeopleService{

	@Autowired
	@Qualifier(value="peopleRepository")
	private PeopleRepository peopleRepository;
	
	@Override
	public void save(People people) {
		peopleRepository.save(people);
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return peopleRepository.existsById(id);
	}

	@Override
	public People getPeopleById(String id) {
		// TODO Auto-generated method stub
		return peopleRepository.getPeopleById(id);
	}

}
