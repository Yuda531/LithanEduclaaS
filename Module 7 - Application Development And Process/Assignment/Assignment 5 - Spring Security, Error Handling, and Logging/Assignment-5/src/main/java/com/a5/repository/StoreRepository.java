package com.a5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.a5.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{
	
	List<Store> findByEmail(String email);
}
