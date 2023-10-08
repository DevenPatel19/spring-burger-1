package com.codingdojo.springburger1.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.springburger1.models.Burger;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {
	List<Burger> findAll();
}
