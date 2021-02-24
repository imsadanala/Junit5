package com.ss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ss.shared.Utils;

@SpringBootTest
class JunitTddApplicationTests {

	@BeforeAll
	public static void setUp() {
		System.out.println("@BeforeAll");
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("@AfterAll");
	}

	@BeforeEach
	public void setUpRecc() {
		System.out.println("@BeforeEach Recc");
	}

	@AfterEach
	public void tearDownRecuu() {
		System.out.println("@BeforeEach Recc");
	}

	@Test
	public void testAdd() {
		assertEquals(10, Utils.add(5, 5));
	}

	@Test
	public void testAddDiff() {
		assertEquals(0, Utils.add(0, 0));
	}

}
