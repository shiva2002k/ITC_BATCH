package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarsRestController 
{
	@Autowired
	private ICarsService service;
	
	//1. to save the data
	@PostMapping
	public ResponseEntity<String> saveCourse(@RequestBody Cars c)
	{
		Integer id=service.saveCars(c);
		ResponseEntity<String> resp=new ResponseEntity("Cars"+id+" Created",HttpStatus.CREATED);
		return resp;
	}
//2. to view the data	
@GetMapping("/all")
public List<Cars> getAllCars()
{
	List<Cars> allCars=service.getAllCars();
	return allCars;
	}

//3. Fetch course by id.
@GetMapping("/{id}")
public ResponseEntity<?> getCarsId(@PathVariable Integer id)
{
	Cars car=service.getOneCars(id);
	ResponseEntity<?> resp=null;
	try
	{
	 resp=ResponseEntity.ok(car);
	}
	catch(Exception ae)
	{
	 resp=new ResponseEntity<String>("Unable to fetch Data",HttpStatus.INTERNAL_SERVER_ERROR);
	}
		return resp;
	
}
@PutMapping("/update")
public ResponseEntity<Cars> updateCars(@RequestBody Cars updatedCars) {
    Cars Cars = service.updateCars( updatedCars);
    if (Cars != null) {
        return new ResponseEntity<>(Cars, HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}



@DeleteMapping("/delete/{id}")
public ResponseEntity<Void> deleteCars(@PathVariable Integer id) {
    service.deleteCars(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}

}
