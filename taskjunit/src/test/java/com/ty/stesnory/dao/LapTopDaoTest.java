package com.ty.stesnory.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ty.stastnory.Laptop;

class LapTopDaoTest {

	@Test
	void testSaveLaptop() {
		Laptop laptop=new Laptop();
	laptop.setId(102);
		laptop.setBrand("HP");
		laptop.setRam(4);
		laptop.setProcessor("intel");
		laptop.setRom(4000);
		
		LapTopDao dao=new LapTopDao();
		assertEquals(laptop, dao.savelaptop(laptop));
	}

}
