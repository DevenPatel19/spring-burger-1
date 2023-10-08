package com.codingdojo.springburger1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.springburger1.models.Burger;
import com.codingdojo.springburger1.services.BurgerService;

@RestController
@RequestMapping("/api")
public class BurgerAPIController {
	private final BurgerService burgerService;
	
	public BurgerAPIController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	// find all burgers
	@GetMapping("/burgers")
	public List<Burger> getAllBurgers(){
		return burgerService.allBurgers();
	}
	
	// create a new burger
	@PostMapping("/burgers")
	public Burger createBurger(@ModelAttribute("newBurger") Burger newBurger
			) {
		return burgerService.addBurger(newBurger);
	}
	
//	// get one burger by id
//	@GetMapping("/burgers/{id}")
//	public Burger findBurgerById(
//			@PathVariable("id")  Long id
//			) {
//			return burgerService.findBurger(id);
//			}
			
	// update one burger by id -- with Data binding & Path Variable
//	@PutMapping("/burgers/{id}")
//	public Burger updateBurgerById(
//			@PathVariable("id")  Long id,
//			@ModelAttribute("burger") Burger burger
//			) {
//		
//		return burgerService.updateBurgers(burger);
//		}
	
//	Original method Without Model Attribute - Data Binding
//	@PutMapping("/burgers/{id}")
//	public Burger updateBurgerById(
//			@PathVariable("id")  Long id,
//			@RequestParam(value="name") String name,
//			@RequestParam(value="restaurant") String restaurant,
//			@RequestParam(value="rating") Integer rating,
//			@RequestParam(value="notes") String notes
//			) {
//		Burger burger = burgerService.findBurger(id);
//		burger.setName(name);
//		burger.setRestaurant(restaurant);
//		burger.setRating(rating);
//		burger.setNotes(notes);
//		
//		return burgerService.updateBurgers(burger);
//		}
	
//	// delete one burger by id
//	@DeleteMapping("/burgers/{id}")
//	public void deleteBurgerByID(@PathVariable("id")Long id) {
//		burgerService.deleteBurger(id);
//	}
			
			
}
