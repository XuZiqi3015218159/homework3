package com;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {
    Prime prime;
    ByteArrayOutputStream baos;
    
    @Before
    public void setUp() throws Exception {
        prime = new Prime();
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @Test
    public void testPrintPrimes() {
        String outcome = new String("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n");
        prime.printPrimes(5);
        assertEquals(outcome, baos.toString()); 
    }

}