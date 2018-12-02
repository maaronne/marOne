package api.home;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testApp() throws Exception
    {
    	App test = new App();
    	
    	List<?> inputList = Arrays.asList(1,2,3,4,5,6,7);
		List<?> outputList = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5,6), Arrays.asList(7));
		Assert.assertEquals(outputList, test.partition(inputList, 2));
		
    	inputList = Arrays.asList("A","B","C","D","E","FG","x");
		outputList = Arrays.asList(Arrays.asList("A","B"), Arrays.asList("C","D"), Arrays.asList("E","FG"), Arrays.asList("x"));
		Assert.assertEquals(outputList, test.partition(inputList, 2));

    }
}
