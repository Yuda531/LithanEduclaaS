package com.lithan.abc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lithan.abc.model.Car;
import com.lithan.abc.model.CarBidding;
import com.lithan.abc.model.User;

@Repository
public interface BidRepository extends JpaRepository<CarBidding, Long>{
	
	List<CarBidding> findByUserAndCar(User user, Car car);
	
	List<CarBidding> findByUser(User user);

}
