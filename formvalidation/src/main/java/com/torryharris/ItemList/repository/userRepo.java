package com.torryharris.ItemList.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.torryharris.ItemList.entities.Details;


public interface userRepo extends CrudRepository<Details,Integer> {

	public String existsByuserName(String name);
	public Details findByuserNameAndPassword(String name,String password);
	
	public String findByuserNameAndName(String userName, String name);
	
	@Query("select u.password from Details u where userName=?1")
	public String findPasswordByuserName(String userName);
	
	

}
