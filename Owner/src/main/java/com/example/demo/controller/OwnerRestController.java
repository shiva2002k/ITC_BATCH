package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Owner;

import IownerService.IOwnerService;

@RestController

@RequestMapping("/owner")

public class OwnerRestController {

    @Autowired

    private IOwnerService service;

    @PostMapping

    public ResponseEntity<String> saveOwner(@RequestBody Owner c) {

        Integer id = service.saveOwner(c);

        ResponseEntity<String> resp = new ResponseEntity<>("Owner " + id + " Created", HttpStatus.CREATED);

        return resp;

    }

 

    @GetMapping("/all")

    public List<Owner> getAllOwners() {

        List<Owner> allOwners = service.getAllOwners();

        return allOwners;

    }

 

    @GetMapping("/{id}")

    public ResponseEntity<?> getOwnerId(@PathVariable Integer id) {

        Owner owner = service.getOneOwner(id);

        ResponseEntity<?> resp = null;

        try {

            resp = ResponseEntity.ok(owner);

        } catch (Exception e) {

            resp = new ResponseEntity<>("Unable to fetch Data", HttpStatus.INTERNAL_SERVER_ERROR);

        }

        return resp;

    }

}
