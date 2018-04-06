/**
 * 
 */
package com.boilerplate.springstarter.mosaic;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author priyamgupta
 *
 */
@RestController
@RequestMapping("byparcel")
public class AccessrdsController {
	private static final Logger logger = LogManager.getLogger();
//	@Autowired
//	private ParcelService parcelService;

	@Autowired
	private ParcelRepository parcelRepository;
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<AccessrdsBuffByParcel> getParcelList() {
		logger.info("Accessing getParcelList...");
		return parcelRepository.findAll();
	}
	@GetMapping(value = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Optional<AccessrdsBuffByParcel> getParcelList(@PathVariable ObjectId id) {
		logger.info("Accessing getParcelList...");
		return parcelRepository.findById(id);
	}
}
