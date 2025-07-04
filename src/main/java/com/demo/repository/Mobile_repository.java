 package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Mobile_entity;

public interface Mobile_repository extends JpaRepository<Mobile_entity,Integer>{
@Query(value="select *From Mobiletable where Price=50000",nativeQuery=true)
	Integer value();


@Query(value="select *from Mobiletable where Price>=45000",nativeQuery=true)
List<Mobile_entity> val();


@Query(value="select *from Mobiletable where Brand='vivo'",nativeQuery=true)
List<Mobile_entity> gro();
 
 

@Query(value="select *from Mobiletable where Brand=?;",nativeQuery=true)
List<Mobile_entity> gh(String z);

@Query(value="select id ,avg(Price) From MObiletable Group By id",nativeQuery=true)
List<Mobile_entity> byy();

@Query(value="select *from Mobiletable where Price=(select max(Price) from Mobiletable);",nativeQuery=true)
List<Mobile_entity> two();

@Query(value="select *from Mobiletable where Brand like concat('%',?);",nativeQuery=true)
List<Mobile_entity> lik(char v);
 
@Query(value="select sum(e.price) from Mobile_entity e")
List<Integer> maxp();
@Query(value="select max(e.price)from Mobile_entity e")
int mob();

@Query(value="select e from Mobile_entity e where e.price=(select max(e.price) from Mobile_entity e)")
List<Mobile_entity> maxprice();

@Query(value="select e from Mobile_entity e where e.price between 20000 and 60000")
List<Mobile_entity> between(); 

@Query(value="select e from Mobile_entity e where e.price between ?1 and ?2")
List<Mobile_entity> findd(int a, int b);

@Query(value="select e from Mobile_entity e where e.brand=?1")
List<Mobile_entity> str(String h);

@Query("select f from Mobile_entity f where f.price=(select max(f.price) from Mobile_entity f where f.price<(select max(f.price)from Mobile_entity f))") 
List<Mobile_entity> sub();

 

}
  