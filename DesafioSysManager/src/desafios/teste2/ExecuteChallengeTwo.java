package desafios.teste2;

/**
 * @author felipe.silva
 * @date 31/05/2020
 */

public class ExecuteChallengeTwo {
	
	public static void main(String[] args) {
		
		int key = 3;

		String result = ChallengeTwo.toEncrypt("aBCZZABC", key);
		System.out.println("criptografia = " + result);
		
		result = ChallengeTwo.toDecrypt(result, key);
		System.out.println("descriptografia = " + result);
    }	
}
