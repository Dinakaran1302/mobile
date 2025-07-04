package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.entity.Mobile_entity;
import com.demo.service.Mobile_service;

@RestController
@RequestMapping(value="/one")
public class Mobile_controller {
	@Autowired
	Mobile_service ms;
	@PostMapping(value="/two")
	public String Emp(@RequestBody List<Mobile_entity> e ) {
		return ms.Emp(e);
	}
	@GetMapping(value="/three")
	public List<Mobile_entity> getid(){
		return ms.getid();
}
	@GetMapping(value="/max")
	public Integer getmax(@RequestBody List<Mobile_entity> m) {
		return ms.maxi(m);
	}
	@GetMapping(value="/maxpr")
	public Mobile_entity getmaxi(@RequestBody List<Mobile_entity> m) {
		return ms.maxip(m);
}
	@GetMapping(value="/four/{a}")
	public  Mobile_entity mob1(@PathVariable int a) {
		return ms.find(a);
}
	@GetMapping(value="/five")
	public List<Mobile_entity> mob2(@RequestBody List<Mobile_entity> b ) {
		return ms.mob2(b);
	}
	@GetMapping(value="/six")
	public List<Mobile_entity> mob3(@RequestBody List<Mobile_entity> b ) {
		return ms.mob3(b);
}
	@GetMapping(value="/seven")
	public List<Mobile_entity> mob4( ) {
		return ms.mob5();
	}
	

	@GetMapping(value="/eight")
	public Integer qua() {
		return ms.pass();
		
	}
	@GetMapping (value="/answer")
	public List<Mobile_entity> ans(){
		return ms.an();
	}
	@GetMapping (value="/ten")
	public List<Mobile_entity> goup(){
		return ms.go();
}
	//@GetMapping (value="/tenn")
	//public List<Mobile_entity> betw(){
		//return ms.be();
//
	@GetMapping (value="/dina/{z}")
	public List<Mobile_entity> name(@PathVariable String z){
		return ms.ben(z);
}
	@GetMapping (value="/group")
	public List<Mobile_entity> gpby(){
		return ms.gup();

}
	@GetMapping (value="/group1")
	public List<Mobile_entity> gpbye(){
		return ms.gupe();
}
	@GetMapping (value="/group2/{v}")
	public List<Mobile_entity> lik(@PathVariable char v){
		return ms.lik(v);
}
	@GetMapping (value="/group3")
	public List<Integer> maxp(){
		return ms.maxp();
}
	@GetMapping (value="/group4")
	public int mob(){
		return ms.mob();
}
	@GetMapping (value="/group5")
	public List<Mobile_entity> maxprice(){
		return ms.maxprice();
}
	@GetMapping (value="/bet")
	public List<Mobile_entity> between(){
		return ms.between();
}
	@GetMapping(value="/find/{a}/{b}")
	public List<Mobile_entity> findd(@PathVariable int a ,@PathVariable int b){
		return ms.findd(a,b);
	}
	@GetMapping (value="/dinak/{h}")
	public List<Mobile_entity> str(@PathVariable String h){
		return ms.str(h);
}
	@GetMapping (value="/sub")
	public List<Mobile_entity> subqu() {
	return ms.sub();
}
}
	
