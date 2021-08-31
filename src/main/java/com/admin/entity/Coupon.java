package com.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int couponId;
	private String CouponName;
	private int couponValue;
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coupon(int couponId, String couponName, int couponValue) {
		super();
		this.couponId = couponId;
		CouponName = couponName;
		this.couponValue = couponValue;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponName() {
		return CouponName;
	}
	public void setCouponName(String couponName) {
		CouponName = couponName;
	}
	public int getCouponValue() {
		return couponValue;
	}
	public void setCouponValue(int couponValue) {
		this.couponValue = couponValue;
	}
	
	
	
}
