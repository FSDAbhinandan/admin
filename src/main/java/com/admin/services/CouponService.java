package com.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.entity.Coupon;
import com.admin.repository.CouponRepository;

@Service
public class CouponService {

	@Autowired
	private CouponRepository couponRepository;
	
	public Coupon addCoupon(Coupon coupon) {
		return this.couponRepository.save(coupon);
	}
	
	public List<Coupon> getAllCoupon() {
		return this.couponRepository.findAll();
	}
	
	public void deleteCoupon(int id) {
		this.couponRepository.deleteById(id);
	}
}
