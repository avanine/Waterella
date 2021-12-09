package com.waterella.mdbspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.mdbspringboot.repository.ItemRepository;
import com.waterella.mdbspringboot.model.TipItem;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication implements CommandLineRunner {

    @Autowired
    ItemRepository tipItemRepo;

    List<TipItem> itemList = new ArrayList<TipItem>();

    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }

    public void run(String... args) {

          luoLukuvinkki("joku","moi", "heipähei");
//        Clean up any previous data
//        groceryItemRepo.deleteAll(); // Doesn't delete the collection

//        System.out.println("-------------CREATE GROCERY ITEMS-------------------------------\n");
//
//        createGroceryItems();
//
//        System.out.println("\n----------------SHOW ALL GROCERY ITEMS---------------------------\n");
//
//        showAllGroceryItems();
//
//        System.out.println("\n--------------GET ITEM BY NAME-----------------------------------\n");
//
//        getGroceryItemByName("Whole Wheat Biscuit");
//
//        System.out.println("\n-----------GET ITEMS BY CATEGORY---------------------------------\n");
//
//        getItemsByCategory("millets");
//
//        System.out.println("\n-----------UPDATE CATEGORY NAME OF ALL GROCERY ITEMS----------------\n");
//
//        updateCategoryName("snacks");
//
//        System.out.println("\n-----------UPDATE QUANTITY OF A GROCERY ITEM------------------------\n");
//
//        updateItemQuantity("Bonny Cheese Crackers Plain", 10);
//
//        System.out.println("\n----------DELETE A GROCERY ITEM----------------------------------\n");
//
//        deleteGroceryItem("Kodo Millet");
//
//        System.out.println("\n------------FINAL COUNT OF GROCERY ITEMS-------------------------\n");
//
//        findCountOfGroceryItems();
//
//        System.out.println("\n-------------------THANK YOU---------------------------");

    }

    // CRUD operations
    //CREATE
    void alustaLukuvinkit() {

        tipItemRepo.save(new TipItem("asd","asd","asd","asd"));
    
    }

    // READ
    // 1. Show all the data
    public void naytaKaikkiLukuvinkit() {

        itemList = tipItemRepo.findAll();

//        itemList.forEach(item -> System.out.println(getItemDetails(item)));
    }

    public void luoLukuvinkki(String category, String name, String description) {

        tipItemRepo.save("asd");

    }

//	 // 2. Get item by name
//	 public void getGroceryItemByName(String name) {
//		 System.out.println("Getting item by name: " + name);
//		 GroceryItem item = groceryItemRepo.findItemByName(name);
//		 System.out.println(getItemDetails(item));
//	 }
//	 
//	 // 3. Get name and items of a all items of a particular category
//	 public void getItemsByCategory(String category) {
//		 System.out.println("Getting items for the category " + category);
//		 List<GroceryItem> list = groceryItemRepo.findAll(category);
//		 
//		 list.forEach(item -> System.out.println("Name: " + item.getName() + ", Quantity: " + item.getItemQuantity()));
//	 }
//	 
//	 // 4. Get count of documents in the collection
//	 public void findCountOfGroceryItems() {
//		 long count = groceryItemRepo.count();
//		 System.out.println("Number of documents in the collection = " + count);
//	 }
//	 
//	 // UPDATE APPROACH 1: Using MongoRepository
//	 public void updateCategoryName(String category) {
//		 
//		 // Change to this new value
//		 String newCategory = "munchies";
//		 
//		 // Find all the items with the category 
//		 List<GroceryItem> list = groceryItemRepo.findAll(category);
//		 
//		 list.forEach(item -> {
//			 // Update the category in each document
//			 item.setCategory(newCategory);
//		 });
//		 
//		 // Save all the items in database
//		 List<GroceryItem> itemsUpdated = groceryItemRepo.saveAll(list);
//		 
//		 if(itemsUpdated != null)
//			 System.out.println("Successfully updated " + itemsUpdated.size() + " items.");		 
//	 }
//	 
//	 
//	 // UPDATE APPROACH 2: Using MongoTemplate
//	 public void updateItemQuantity(String name, float newQuantity) {
//		 System.out.println("Updating quantity for " + name);
//		 customRepo.updateItemQuantity(name, newQuantity);
//	 }
//	 
//	 // DELETE
//	 public void deleteGroceryItem(String id) {
//		 groceryItemRepo.deleteById(id);
//		 System.out.println("Item with id " + id + " deleted...");
//	 }
//	 // Print details in readable form
//	 
//    public String getItemDetails(GroceryItem item) {
//
//        System.out.println(
//                "Item Name: " + item.getName()
//                + ", \nItem Quantity: " + item.getItemQuantity()
//                + ", \nItem Category: " + item.getCategory()
//        );
//
//        return "";
//    }
}
