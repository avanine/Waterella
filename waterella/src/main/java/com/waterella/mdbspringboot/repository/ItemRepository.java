
  
package com.waterella.mdbspringboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.mdbspringboot.model.GroceryItem;
import com.waterella.mdbspringboot.model.TipItem;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {
	
	@Query("{name:'?0', description:'?0', category:'?0'}")
	TipItem findItemByName(String name);
//	
//	@Query(value="{category:'?0'}", fields="{'name' : 1, 'description' : 1}")
//	List<GroceryItem> findAll(String category);
	
	public long count();

}