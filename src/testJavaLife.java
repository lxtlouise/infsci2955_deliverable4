

import static org.junit.Assert.*;

import java.util.Random;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class testJavaLife {

	//When the size of the world is negative, the NegativeArraySizeExcetption should be thrown
	@Test(expected = NegativeArraySizeException.class)
	public void testNegative(){
		World w = new World(-100,0,0);
		String actual = w.toString();
	}

	//When the size, seed and percent of the world are all zero, there should be nothing in the output.
	@Test
	public void testToStringAllZero(){
		World w = new World(0, 0, 0);
		String actual = w.toString();
		String expected = "  \n";
		assertEquals(expected, actual);
		
	}
	
	//When the size of the world is 1, the first row of the output should be 0,
	//and there should be one row of dot showing the world.
	@Test
	public void testToStringOne(){
		World w = new World(1, 1, 0);
		String actual = w.toString();
		String expected ="  0" + "\n"+
                         "0 ." + "\n";
		assertEquals(expected, actual);
	}
	
	//When the size of the world is 10, the first row of the output should be 10 consecutive numbers: 0-9,
    //and there should be ten rows of dots showing the world. 
	@Test
	public void testToStringTen(){
		World w = new World(10, 1, 0);
		String actual = w.toString();
		String expected ="  0123456789" + "\n" +
	                     "0 .........." + "\n" +
	                     "1 .........." + "\n" +
	                     "2 .........." + "\n" +
	                     "3 .........." + "\n" +
	                     "4 .........." + "\n" +
	                     "5 .........." + "\n" +
	                     "6 .........." + "\n" +
	                     "7 .........." + "\n" +
	                     "8 .........." + "\n" +
	                     "9 .........." + "\n";
		assertEquals(expected, actual);

	}
	
	//When the size of the world is 11, the first row of the output should be 11 consecutive numbers: 0-9 and 0,
    //and there should be eleven rows of dots showing the world. 
	@Test
	public void testToStringEleven(){
		World w = new World(11, 1, 0);
		String actual = w.toString();
		String expected ="  01234567890" + "\n" +
	                     "0 ..........." + "\n" +
	                     "1 ..........." + "\n" +
	                     "2 ..........." + "\n" +
	                     "3 ..........." + "\n" +
	                     "4 ..........." + "\n" +
	                     "5 ..........." + "\n" +
	                     "6 ..........." + "\n" +
	                     "7 ..........." + "\n" +
	                     "8 ..........." + "\n" +
	                     "9 ..........." + "\n" +
	                     "0 ..........." + "\n" ;
		assertEquals(expected, actual);
	}
	
	//When the size of the world is 10 and the percent is 100, the first row of the output should be 10 consecutive numbers: 0-9,
	//and there should be ten rows of 'x' showing the world
	@Test
	public void testToStringTenX(){
		World w = new World(10, 1, 100);
		String actual = w.toString();
		String expected ="  0123456789" + "\n" +
	                     "0 XXXXXXXXXX" + "\n" +
	                     "1 XXXXXXXXXX" + "\n" +
	                     "2 XXXXXXXXXX" + "\n" +
	                     "3 XXXXXXXXXX" + "\n" +
	                     "4 XXXXXXXXXX" + "\n" +
	                     "5 XXXXXXXXXX" + "\n" +
	                     "6 XXXXXXXXXX" + "\n" +
	                     "7 XXXXXXXXXX" + "\n" +
	                     "8 XXXXXXXXXX" + "\n" +
	                     "9 XXXXXXXXXX" + "\n";
		assertEquals(expected, actual);
	}
}
