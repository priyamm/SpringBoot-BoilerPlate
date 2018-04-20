/**
 * 
 */
package com.boilerplate.springstarter.counter;

import java.util.Optional;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author priyamgupta
 *
 */
public interface CounterRepository extends CrudRepository<CounterMirror, Long> {
	
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	Optional<CounterMirror> findById(Long id);
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE)
	@Modifying
	@Query(value = "UPDATE COUNTER_MIRROR SET COUNT = ?1 + 1 WHERE ID = 1", nativeQuery = true)
	Integer updateCounter(Integer id);
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.SERIALIZABLE)
	@Modifying
	@Query(value = "UPDATE COUNTER_MIRROR SET COUNT = COUNT + 1 WHERE ID = 1", nativeQuery = true)
	Integer updateCounterAtOnce();

}
