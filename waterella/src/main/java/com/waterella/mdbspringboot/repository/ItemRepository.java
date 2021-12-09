
  
package com.waterella.mdbspringboot.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.waterella.mdbspringboot.model.TipItem;

public interface ItemRepository extends MongoRepository<TipItem, String> {
	
	@Query("{name:'?0'}")
	TipItem findItemByName(String name);
	
	@Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
	List<TipItem> findAll(String category);
	
	public long count();


}