package com.ss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ss.dto.Employee;
import com.ss.shared.Utils;

//@Disabled(value = "Disabled all tests under this class to fix Bug#3456")
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

	@Test
	public void assertTrueTest() {
		assertTrue(75 > 9, "75 greater than 9");
		assertTrue(() -> 10 > 9, "75 greater than 9 using BooleanSupplier");
	}

	@Test
	public void assertEqualsTest() {
		assertEquals(Utils.add(2, 2), 4);
		// to check delta using assert equals
		Integer squareResult = 2 * 2;
		Integer addtionResult = 2 + 2;
		Integer delta = 0;
		assertEquals(squareResult, addtionResult, delta);
	}

	@Test
	public void assertNotNullTest() {
		Object object = new Object();
		assertNotNull(object, () -> "object is not null");
	}

	@Test
	public void assertSameTest() {
		String s1 = "SS";
		String s2 = new String("SS");
		assertSame(s2.intern(), s1); // two objects are same or not
	}

	@Test
	public void assertAllTest() { // to execute set of test cases
		Employee employee = new Employee("Suresh ", "Sadanala");
		Assertions.assertAll("EmployeeTest", () -> assertNotNull("first name is not null", employee.getFirstName()),
				() -> assertEquals("Sadanala", employee.getLastName()));
	}

	@Test
	public void assertThrowTest() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("not Integer Type");
		});
		assertEquals("not Integer Type", exception.getMessage());
	}

	@Test
	public void assertDoesnotThrowTest() {
		Assertions.assertDoesNotThrow(() -> Double.parseDouble("356E+8"), "unable to parse string into double");
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
