package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer>{
	
}
