package desafios.teste3;

/**
 * @author felipe.silva
 * @date 31/05/2020
 */

public class ExecuteChallengeThree {

	public static void main(String[] args) {
		
		int i = 15000;

		while (true) {
			try {
				int myResult = ChallengeThree.testFibonacci(i);
				System.out.println(myResult);
				i++;
			} catch (StackOverflowError error) {
				System.out.println("Limite de recursividade: " + i);
				break;
			}
		}
	}
}
