/**
 * 
 */
package com.boilerplate.springstarter.counter;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author priyamgupta
 *
 */
public interface CounterRepository extends CrudRepository<CounterMirror, Long> {
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE COUNTER_MIRROR SET COUNT = COUNT + 1 WHERE ID = 1", nativeQuery = true)
	Integer updateCounter();

}
