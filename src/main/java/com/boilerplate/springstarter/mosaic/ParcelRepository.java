/**
 * 
 */
package com.boilerplate.springstarter.mosaic;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author priyamgupta
 *
 */
@Repository
public interface ParcelRepository extends MongoRepository<AccessrdsBuffByParcel, ObjectId> {
	List<AccessrdsBuffByParcel> findAll();
}
