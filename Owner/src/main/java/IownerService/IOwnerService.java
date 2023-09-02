package IownerService;


 

import java.util.List;

import com.example.demo.entity.Owner;

 

public interface IOwnerService {

 

    Integer saveOwner(Owner c);

 

    List<Owner> getAllOwners();

 

    Owner getOneOwner(Integer id);

}
