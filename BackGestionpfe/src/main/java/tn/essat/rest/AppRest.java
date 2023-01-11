package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IPfe;
import tn.essat.model.Pfe;



@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class AppRest{
	@Autowired
	IPfe Pfedao;
	
	
	@DeleteMapping("/deletepfe/{id}")
	public void get3(@PathVariable int id){
	 Pfedao.deleteById(id);
}
	@PostMapping("/savepfe")
	public void get4(@RequestBody Pfe m){
	Pfedao.save(m);	
}
	
		
	
	@GetMapping("/pfes")
	public List<Pfe>f22(){
		return Pfedao.findAll();
		
	}
	@GetMapping("/findbytitre/{titre}")
	public Pfe f23(@PathVariable("titre") String titre){
		 return  Pfedao.findByTitre(titre);
	
	}
	@GetMapping("/findbytype/{type}")
	public List<Pfe> f24(@PathVariable("type") String type){
		 List<Pfe> p = Pfedao.findByType(type);
		 return p;
	}
}
