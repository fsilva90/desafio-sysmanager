package testes.junit;

import desafios.teste1.ChallengeOne;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author felipe.silva
 * @date 01/06/2020
 */

public class TestChallengeOne extends TestCase {

    public TestChallengeOne(String testName) {
        super(testName);

    }
    
    static Test suite() {
        return new TestSuite(TestChallengeOne.class);
    }
    
     public void testApp() {
     
    	 assertTrue(isPrime(ChallengeOne.getPrimeBiggerNumber(0, 100000))); 
     }
     
 	public static Boolean isPrime(int k) {
	    int i = 2;
	    
	    while (i * i <= k) {
	        
	    	if (k % i == 0)
	            return false;
	    	
	        i += 1;
	    }   	
	    return true;
	}
}
