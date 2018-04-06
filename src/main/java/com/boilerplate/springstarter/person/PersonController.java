package com.boilerplate.springstarter.person;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/person")
public class PersonController {
//	private Logger logger = LoggerFactory.getLogger(getClass());
	private static final Logger logger = LogManager.getLogger();
	@Autowired
	private PersonService personService;
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/check")
	public String getStatus() {
		logger.info("Checking status... {}", "Great");
		return "Active Status";
	}
	
	@GetMapping("person")
	public List<Person> getPerson() {
		return personService.getPersonList();
	}
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "find")
	public Person getPersonFromDB() {
		return personRepository.findByName("Priyam Gupta");
	}
	
	@GetMapping(value = "mongo/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Person> getPersonListFromDB() {
		return personRepository.findAll();
	}
	
	@PostMapping(value = "mongo", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public Person insertPerson() {
		return personRepository.insert(new Person("Srini", (short)60, "Kanika's Big Brother"));
	}
	
	@GetMapping(value = "name/{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person getPersonListNameFromDB(@PathVariable String name) {
		return personRepository.findByQuery(name);
	}
	
	@GetMapping(value = "age/{age}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Person> getPersonListAgeFromDB(@PathVariable Short age) {
		try {
			return personRepository.findByAgeNumeric(age);
		} catch(Exception e) {
			return null;
	}
	}
}
