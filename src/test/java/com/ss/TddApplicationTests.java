package com.ss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ss.shared.Utils;



@Disabled(value = "Disabled all tests under this class to fix Bug#3456")
@DisplayName(value = "All test cases of Utils")
@SpringBootTest
class TddApplicationTests {

	@BeforeAll
	public static void setUp() {
		System.out.println("@BeforeAll...");
	}

	@BeforeEach
	public void setUpEach() {
		System.out.println("@BeforeEach...");
	}

	@Test
	// @DisplayName(value = "positive numbers test")
	public void testAdd_Positive_Numbers() {
		assertEquals(10, Utils.add(5, 5));
	}

	@Test
	// @DisplayName(value = "negative numbers test")
	public void testAdd_Negative_numbers() {
		assertEquals(-4, Utils.add(-1, -3));
	}

	@Test
	// @DisplayName(value = "both positive and negative numbers test")
	public void testAdd_One_Positive_One_Negative() {
		assertEquals(20, Utils.add(30, -10));
	}

	@AfterEach
	public void tearDownEach() {
		System.out.println("@AfterEach...");
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("@AfterAll...");
	}

}
