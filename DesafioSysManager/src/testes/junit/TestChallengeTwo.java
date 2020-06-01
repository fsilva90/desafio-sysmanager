package testes.junit;

import desafios.teste2.ChallengeTwo;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author felipe.silva
 * @date 01/06/2020
 */

public class TestChallengeTwo extends TestCase {

    public TestChallengeTwo(String testName) {
        super(testName);

    }
    
    static Test suite() {
        return new TestSuite(TestChallengeTwo.class);
    }
    
     public void testApp() {
    	 
    	 int key = 3;
    	 String message = "Felipe";
     
    	 String cryptography = ChallengeTwo.toEncrypt(message.toUpperCase(), key); 
    	 
    	 assertTrue(message.equalsIgnoreCase(ChallengeTwo.toDecrypt(cryptography, key)));
     }
     
}
