package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class classBTest {


	@Tag("sanity")
	@Test
	@DisplayName("test2")
	public void test2() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
}
