package vy.com.fa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vy.com.fa.entity.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, String> {
	@Query("SELECT u FROM People u WHERE u.id = ?1")
	People getPeopleById(String id);
}
