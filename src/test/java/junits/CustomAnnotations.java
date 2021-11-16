package junits;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.*;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

	
	@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
	@Retention(RetentionPolicy.RUNTIME)
	@Tag("sanity")
	@Test
	@DisplayName("negative tstcase")
	public @interface CustomAnnotations{
		
	}

