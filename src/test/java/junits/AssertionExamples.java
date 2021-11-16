package junits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertionExamples {
	
	@Test
	public void test1() {
		String name1 = "anusha";
		String name2 = "anusha";
		assertEquals(name1,name2);
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		assertArrayEquals(expectedArray, resultArray);
		
	}

}
