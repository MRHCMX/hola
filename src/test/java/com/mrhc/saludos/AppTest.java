package com.mrhc.saludos;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
    	System.setOut(new PrintStream(outStream));
    }
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testSayHello() {
    	App hw = new App();
    	hw.hola();
    	Assert.assertEquals("Hello World!", outStream.toString());
    }
    
    @After
    public void cleanUp() {
    	System.setOut(null);
    }  
}
