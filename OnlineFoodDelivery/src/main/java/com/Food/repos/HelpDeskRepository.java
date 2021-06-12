package com.Food.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Food.models.HelpDesk;

@Repository
public interface HelpDeskRepository extends JpaRepository<HelpDesk, Integer>{

	List<HelpDesk> findByUseridOrderByIdDesc(String userid);
	
	List<HelpDesk> findByStatusOrderByIdDesc(String status);
	
}
