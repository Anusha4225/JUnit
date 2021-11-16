package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	@TestFactory
	public Collection<DynamicTest> method1(){
		
		return Arrays.asList(
		DynamicTest.dynamicTest("Positive Test1", 
				() ->assertTrue(StringFunctions.isPlaindrome("oppo"))),
		DynamicTest.dynamicTest("Positive Test2", 
				() ->assertTrue(StringFunctions.isPlaindrome("madam"))),
		DynamicTest.dynamicTest("Negative Test1", 
				() ->assertFalse(StringFunctions.isPlaindrome("onion")))
		);
	}

}
