package edu.escuelaing.arem.ASE.app;

import java.io.IOException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    @Test
    public void column1MeanTest() throws IOException
    {        
        double expectedMean = 550.60;
        double actualMean = 0.0;
        System.out.println("media actual: "+actualMean);
        AppMethod c1m_test = new AppMethod();
        LinkedList col_1 = AppMethod.col_1;
        AppMethod.readFile();
        System.out.println("media actual: "+actualMean);
        actualMean = AppMethod.media(col_1);      
        //actualMean = expectedMean;
        assertTrue(actualMean == expectedMean);
        //assertTrue( true );
    }

    @Test
    public void column1StdDeviationTest() throws IOException
    {        
        double expectedStdDeviation = 572.03;
        double actualStdDeviation = 0.0;
        AppMethod c1s_test = new AppMethod();
        LinkedList col_1 = AppMethod.col_1;
        AppMethod.readFile();
        
        actualStdDeviation = AppMethod.desEstandar(col_1);      

        assertTrue(actualStdDeviation == expectedStdDeviation);
        //assertTrue( true );
    }
    
    
}
