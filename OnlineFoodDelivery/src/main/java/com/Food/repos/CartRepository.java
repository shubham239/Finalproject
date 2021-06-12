package com.Food.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Food.models.Cart;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	List<Cart> findByUserid(String userid);

	void deleteByUserid(String userid);
}
