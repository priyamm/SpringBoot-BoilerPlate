package com.boilerplate.springstarter.person;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<Person, String> {

	Person findByName(String string);
	
	@Query("{'name' : {$regex: ?0, $options: 'i' }}")
	Person findByQuery(String name);
	
	@Query("{'age' : {'$gte': ?0}}")
	List<Person> findByAgeNumeric(Short age);
	

}
