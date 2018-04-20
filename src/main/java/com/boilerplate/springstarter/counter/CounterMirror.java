/**
 * 
 */
package com.boilerplate.springstarter.counter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author priyamgupta
 *
 */
@Entity
@Table(name = "counter_mirror")
public class CounterMirror {
	@Id
	@GeneratedValue()
	private Long id;
	private Integer count;
	/**
	 * 
	 */
	public CounterMirror() {
		// TODO Auto-generated constructor stub
	}
	
	public CounterMirror(Long id, Integer count) {
		this.id = id;
		this.count = count;
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
}
