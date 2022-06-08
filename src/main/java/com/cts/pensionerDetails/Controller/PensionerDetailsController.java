package com.cts.pensionerDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pensionerDetails.Model.PensionerDetails;
import com.cts.pensionerDetails.Service.PensionerDetailServiceImpl;

import io.swagger.annotations.ApiOperation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *  @author Srikant Babu
 *  @author 894137
 * 
 *         Pensioner Details Controller is to get the details of pensioner by
 *         passing the Aadhaar Number
 *
 */
@RestController
@CrossOrigin
public class PensionerDetailsController {
	private static final Logger log = LogManager.getLogger(PensionerDetailsController.class);

	@Autowired
	private PensionerDetailServiceImpl pensionerDetailService;

	/**
	 * @URL: http://localhost:8083/pensionerDetailByAadhaar/123456789012
	 * 
	 * @return if Aadhaar Number then return the pensioner details else throws
	 *         Exception
	 * 
	 * @Expceted: {
				  "name": "Achyuth",
				  "dateOfBirth": "1956-09-11T18:30:00.000+00:00",
				  "pan": "BHMER12436",
				  "salary": 27000,
				  "allowance": 10000,
				  "pensionType": "self",
				  "bank": {
				    "bankName": "ICICI",
				    "accountNumber": 12345678,
				    "bankType": "private"
				  }
				}
	 *
	 */

	@GetMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetails getPensionerDetailByAadhaar(@PathVariable String aadhaarNumber) {
		log.info("START - getPensionerDetailByAadhaar()");
		return pensionerDetailService.getPensionerDetailByAadhaarNumber(aadhaarNumber);
	}
	
	@GetMapping("/Hello")
	public String HelloWorld() {
		log.info("START ()");
		return "<h1>Hello World</h1>";
	}
	
	@GetMapping("/HealthCheck")
	@ApiOperation(value = "healthCheck", notes = "Check whether microservice is up and running or not", httpMethod = "GET", response = String.class)
	public ResponseEntity<String> healthCheck() {
		log.info("Health-Check: OK");
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}

}
