package co.sophos.customer.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.sophos.customer.controller.entities.Customer;
import co.sophos.customer.controller.entities.CustomerResponse;
import co.sophos.customer.controller.entities.Status;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@GetMapping("/query")
	public ResponseEntity<CustomerResponse> query(String UUID, Date clientDate, String channel, String id){
		
		CustomerResponse response = new CustomerResponse();
		response.setChannel(channel);
		response.setServerDate(new Date());
		response.setUUID(UUID);
		
		Status status = new Status();
		status.setDescCode("Ok");
		status.setSeverity("INFO");
		status.setStatusCode(0);
		response.setStatus(status);
		
		Customer customer = new Customer();
		customer.setAddress("Autopista Sur");
		customer.setBrirthDate(new Date());
		customer.setCity("BOGOTA");
		customer.setCountry("COLOMBIA");
		customer.setEmail("xxxxxxx@gmail.com");
		customer.setFirstName("RICARDO RENE");
		customer.setFullName("RICARDO RENE RODRIGUEZ LOPEZ");
		customer.setLastName("RODRIGUEZ LOPEZ");
		customer.setId(id);
		customer.setPhone("301-1345678");
		customer.setSex("M");
		response.setCustomer(customer);
		
		return ResponseEntity.ok(response);
	}

}
