package com.example.demo;

import java.util.List;

public interface ICarsService 
{
public Integer saveCars(Cars c);
public List<Cars> getAllCars();
public Cars getOneCars(Integer id);
Cars updateCars(Cars updatedCars);
void deleteCars(Integer id);
}
