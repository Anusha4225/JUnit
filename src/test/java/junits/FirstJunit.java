package junits;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class FirstJunit {
	
	@BeforeAll
	public static void method3() {
		System.out.println("inside before all");
	}
	@BeforeEach
	public void method1() {
		System.out.println("Inside before method");
	}
	@Test
	public void test1() {
		System.out.println("Inside Test1");
		boolean flag = true;
		Assert.assertTrue(flag);
	}
	@Test
	public void test2() {
		System.out.println("Inside Test2");
	}
	@AfterEach
	public void method2() {
		System.out.println("Inside after method");
	}
	

	@AfterAll
	public static void method4() {
		System.out.println("inside after all");
	}
}

