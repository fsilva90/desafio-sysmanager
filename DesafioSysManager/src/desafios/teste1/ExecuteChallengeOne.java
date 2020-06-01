package desafios.teste1;

import java.util.ArrayList;
import java.util.List;

import desafios.teste1.ChallengeOne;

/**
 * @author felipe.silva
 * @date 31/05/2020
 */

public class ExecuteChallengeOne {

	public static void main(String[] args) {
		
		System.out.println(ChallengeOne.getPrimeBiggerNumber(0, 100000)); ;

		System.out.println(isPrime(ChallengeOne.getPrimeBiggerNumber(0, 100000)));
		
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
