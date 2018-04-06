package com.boilerplate.springstarter.person;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "person")
//@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
	
	 @Id
	 private String id;
	 private String name;
	 private Short age;
	 private String description;
	 
 public Person() {
	// TODO Auto-generated constructor stub
}
 
 public Person(String name, Short age, String description) {
	 this.name = name ;
	 this.age = age;
	 this.description = description;
 }
 
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
public Short getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(Short age) {
	this.age = age;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
}
