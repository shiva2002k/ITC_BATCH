package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsServiceImpl implements ICarsService {
	@Autowired
	private CarsRepository repo;
	
	
	Cars x = null;

	@Override
	public Integer saveCars(Cars c) {
		c = repo.save(c);
		return c.getCarno();
	}

	@Override
	public List<Cars> getAllCars() {
		List x = (List) repo.findAll();
		return x;
	}

	@Override
	public Cars getOneCars(Integer id) {
		Optional<Cars> opt = repo.findById(id);
		return opt.get();
	}

	@Override
	public Cars updateCars(Cars updatedCars ) {
		repo.save(updatedCars);
		return null;
	}

	@Override
	public void deleteCars(Integer id) {
		repo.deleteById(id);
	}

	
	

}
