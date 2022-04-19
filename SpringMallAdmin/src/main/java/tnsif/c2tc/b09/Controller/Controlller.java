package tnsif.c2tc.b09.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.b09.Service.MallAdminService;
import tnsif.c2tc.b09.entity.MallAdmin;
@RestController
public class Controlller {
	
	
	@Autowired
	MallAdminService  service;
	   @PostMapping("/addMallAdmin/{id}")
	    public  MallAdmin addMallAdmin(@RequestBody MallAdmin M)
	    {
		 return service.addMallAdmin(M);
		
}
       @GetMapping("/getMallAdmin/{id}")
	   public  MallAdmin getMallAdmin( @PathVariable int  id)
	   {
          return service.getMallAdmin(id);
        
	   }
       @PutMapping("/updateMallAdmin")
       public MallAdmin updateMallAdmin(@RequestBody MallAdmin M)
       {
       return service.updateMallAdmin(M);
}
       @DeleteMapping("/deleteMallAdmin/{id}")
      public MallAdmin deleteMallAdmin(@PathVariable int id)
      {
    	   return service.deleteMallAdmin(id);
       }
}
