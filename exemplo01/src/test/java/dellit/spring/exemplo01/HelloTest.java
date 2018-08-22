package dellit.spring.exemplo01;

import static org.junit.Assert.*;
import org.junit.*;

public class HelloTest {
	
	@Test
	public void test() {
		String expected = "Hello!";
		String actual = Hello.greeting();
		assertEquals(expected, actual);
	}
}
