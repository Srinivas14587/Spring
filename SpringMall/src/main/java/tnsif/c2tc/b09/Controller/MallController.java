package tnsif.c2tc.b09.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.b09.Service.MallService;
import tnsif.c2tc.b09.entity.Mall;

@RestController
public class MallController {
	@Autowired
   MallService service;
	@PostMapping("/addMall")
	public Mall addmall(@RequestBody Mall M)
	{
		return service.addMall(M);
	}
	@GetMapping("/getMall/{id}")
	public Mall getmall(@PathVariable int id)
	{
		return service.getMall(id);
	}
   @PutMapping("/updateMall")
   public Mall updateMall(@RequestBody Mall M)
   {
	   return service.updateMall(M);
   }
   @GetMapping("/getMalls")
   public List<Mall> getMalls() 
   {
	return service.getMalls();
   }
} 


