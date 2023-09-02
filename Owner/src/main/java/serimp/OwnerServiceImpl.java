package serimp;


 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Owner;
import com.example.demo.repository.OwnerRepository;

import IownerService.IOwnerService;

 

@Service

public class OwnerServiceImpl implements IOwnerService {

 

    @Autowired

    private OwnerRepository repo;

 

    @Override

    public Integer saveOwner(Owner c) {

        c = repo.save(c);

        return c.getUid();

    }

 

    @Override

    public List<Owner> getAllOwners() {

        List<Owner> allOwners = (List<Owner>) repo.findAll();

        return allOwners;

    }

 

    @Override

    public Owner getOneOwner(Integer id) {

        Optional<Owner> opt = repo.findById(id);

        return opt.orElse(null);

    }

}
