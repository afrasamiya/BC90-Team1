package com.torryharris.ItemList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.torryharris.ItemList.entities.houses;

public interface houseRepo extends CrudRepository<houses,Integer>{
	
	public String findByCity(String city);
	
	@Query(value="select * from houses  where city=?1",nativeQuery=true)
	public List<houses> search(String city);

}
