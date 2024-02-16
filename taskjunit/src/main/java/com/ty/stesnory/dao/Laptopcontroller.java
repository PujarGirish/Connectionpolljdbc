package com.ty.stesnory.dao;

import com.ty.stastnory.Laptop;

public class Laptopcontroller {
public static void main(String[] args) {
	Laptop laptop=new Laptop();
	laptop.setId(101);
	laptop.setBrand("HP");
	laptop.setRam(4);
	laptop.setProcessor("intel");
	laptop.setRom(4000);
	
	laptop=new LapTopDao().savelaptop(laptop);
	System.out.println(laptop.getId());
}
}
