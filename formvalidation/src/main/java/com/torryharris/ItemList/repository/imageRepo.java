package com.torryharris.ItemList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.torryharris.ItemList.entities.Images;



public interface imageRepo  extends CrudRepository<Images,Integer>{
	
	@Query(value="select * from Images  where city=?1",nativeQuery=true)
	public List<Images> search(String city);

}
