package com.boilerplate.springstarter.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
		
		private List<Person> personList = new ArrayList<>();
		
		public List<Person> getPersonList() {
			personList.add(new Person("Priyam Gupta 21", (short)25, "Hey there!"));
			personList.add(new Person("Priyam Gupta 2", (short)20, "Hey there!!"));
			personList.add(new Person("Priyam Gupta 25", (short)21, "Hey there!!!"));
			return personList;
		}
}



//new Person(1, "Priyam Gupta 21", (short)25, "Hey there!!"),
//new Person(1, "Priyam Gupta 22", (short)23, "Hey there!!!")