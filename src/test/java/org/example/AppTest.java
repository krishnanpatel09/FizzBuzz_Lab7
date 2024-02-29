package org.example;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.example.App.Fizzbuzz;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFizzBuzz(){
        assertEquals("1", Fizzbuzz(1));
        assertEquals("2", Fizzbuzz(2));
        //Test case for fizz
        assertEquals("Fizz", Fizzbuzz(3));
        assertEquals("Fizz", Fizzbuzz(6));
        assertEquals("Fizz", Fizzbuzz(9));

        //Test case for Buzz
        assertEquals("Buzz", Fizzbuzz(5));
    }
}
