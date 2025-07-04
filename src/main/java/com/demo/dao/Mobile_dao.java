package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Mobile_entity;
import com.demo.repository.Mobile_repository;

@Repository
public class Mobile_dao {
	@Autowired
	Mobile_repository mp;

	public String mob(List<Mobile_entity> e) {
		mp.saveAll(e);
		return "saved successfully" ;
	}

	public List<Mobile_entity> getid() {
		return mp.findAll();
	}

	public Mobile_entity put(int a) {
		return mp.findById(a).orElse(null);
	}

	public List<Mobile_entity> rt() {
		// TODO Auto-generated method stub
		return mp.findAll();
	}

	public Integer passed() {
		return mp.value();
	}

	public List<Mobile_entity> passe() {
		return mp.val();
	}

	public List<Mobile_entity> gr() {
		// TODO Auto-generated method stub
		return mp.gro();
	}

	//public List<Mobile_entity> bet() {
		
		//return mp.ween();
	//}

	public List<Mobile_entity> fin(String z) {
		
		return mp.gh(z);
	}

	public List<Mobile_entity> gu() {
		
		return mp.byy();
	}

	public List<Mobile_entity> one() {
		return mp.two();
	}

	public List<Mobile_entity> lik(char v) {
		
		return mp.lik(v);
	}

	public List<Integer> maxp() {
		
		return mp.maxp();
	}

	public int mob() {
		
		return mp.mob();
	}

	public List<Mobile_entity> maxprice() {
		
		return mp.maxprice();
	}

	public List<Mobile_entity> between() {
		// TODO Auto-generated method stub
		return mp.between();
	}

	public List<Mobile_entity> findd(int a, int b) {
		
		return mp.findd(a,b);
	}

	public List<Mobile_entity> str(String h) {
		// TODO Auto-generated method stub
		return mp.str(h);
	}

	public List<Mobile_entity> sub() {
		return mp.sub();
	}

	//public String pat(int h, Mobile_entity j) {
		//Mobile_entity l=mp.getById(h).get();
		//k.setBrand(j.getBrand());
		//mp.save(k);
		//return null;
	}

	
	

