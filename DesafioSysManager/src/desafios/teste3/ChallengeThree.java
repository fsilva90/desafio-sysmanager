package desafios.teste3;

/**
 * @author felipe.silva
 * @date 31/05/2020
 */

public class ChallengeThree {
	
	public static int testFibonacci(int num) {
		if (num == 1) {
			return 1;
		} else {
			int resultado = 1 + testFibonacci(num - 1);
			return resultado;
		}
	}
}