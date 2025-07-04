package com.demo.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Mobile_dao;
import com.demo.entity.Mobile_entity;
@Service
public class Mobile_service {
	@Autowired
	Mobile_dao md;

	public String Emp(List<Mobile_entity> e) {
		return md.mob(e);
	}

	public List<Mobile_entity> getid() {
		return md.getid();
	}

	public Integer maxi(List<Mobile_entity> m) {
		List<Mobile_entity> g=md.getid();
		Integer n=g.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
		return n;
	}

	public Mobile_entity maxip(List<Mobile_entity> m1) {
		List<Mobile_entity> c=md.getid();
		Mobile_entity n1=c.stream().min(Comparator.comparingInt(Mobile_entity::getPrice)).get();
		return n1;
	} 

	public Mobile_entity find(int a) {
		return md.put(a);
	}
 
	public List<Mobile_entity> mob2(List<Mobile_entity> b) {
		List<Mobile_entity> d=md.getid();
		List<Mobile_entity> s=d.stream().filter(y->y.getBrand().equals("oppo")).collect(Collectors.toList());
		return s;
	}

	public List<Mobile_entity> mob3(List<Mobile_entity> b) {
		List<Mobile_entity> f=md.getid();
		List<Mobile_entity> s1=f.stream().filter(y->y.getPrice()>45000&&y.getPrice()<100000).collect(Collectors.toList());
		return s1;
	}

	public List<Mobile_entity> mob5() {
		List<Mobile_entity> c=md.getid();
		List<Mobile_entity> str=md.rt();
				return str.stream().filter(x->x.getBrand().startsWith("s")).collect(Collectors.toList());
		
}

	
	public Integer pass() {
		return md.passed();
	}

	public List<Mobile_entity> an() {
		return md.passe();
	}

	public List<Mobile_entity> go() {
		return md.gr();
	}

	//public List<Mobile_entity> be() {
		
	//	return md.bet();
	//}

	public List<Mobile_entity> ben(String z) {
		return md.fin(z);
	}

	public List<Mobile_entity> gup() {
		
		return md.gu();
	}

	public List<Mobile_entity> gupe() {
		return md.one();
	}

	public List<Mobile_entity> lik(char v) {
		
		return md.lik(v);
	}

	public List<Integer> maxp() {
		
		return md.maxp();
	}

	public int mob() {
		return md.mob();
	}

	public List<Mobile_entity> maxprice() {
		
		return md.maxprice();
	}

	public List<Mobile_entity> between() {
		// TODO Auto-generated method stub
		return md.between();
	}

	public List<Mobile_entity> findd(int a, int b) {
		
		return md.findd(a,b);
	}

	public List<Mobile_entity> str(String h) {
		// TODO Auto-generated method stub
		return md.str(h);
	}

	public List<Mobile_entity> sub() {
		
		return md.sub();
	}
}
