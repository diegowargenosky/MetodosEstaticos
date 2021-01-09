package Static;

public class Calculadora {

	public static double soma(double num1, double num2) {

		return num1 + num2;
	}

	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}

	public static double potencia(double num1, double num2) {

		return Math.pow(num1, num2);
	}

	public static int fatorialNaorecursivo(int num) {

		if (num == 0) {
			return 1;
		}

		else {

			int fat = 1;

			for (int i = num; i > 0; i--) {
				fat *= i;
			}
			return fat;

		}
	}

	// * Método recursivo *//

	// * fatorial(5) = 5 * fatorial(4) *//
	// * fatorial(4) = 4 * fatorial(3) *//
	// * fatorial(3) = 3 * fatorial(2) *//
	// * fatorial(2) = 2 * fatorial(1) *//
	// * fatorial(1) = 1 * fatorial(0) *//
	// * fatorial(0) = 1; *//
	public static int fatorial(int num) {

		if (num == 0) {
			return 1;
		}

		return num * fatorial(num - 1);

	}

	public static int somatorio(int num) {

		if (num == 1) {
			return 1;
		}
		return num + somatorio(num - 1);

	}

	public static int somatorioNaorecursivo(int num) {

		int total = 0;
		for (int i = num; i > 0; i--) {
			total += i;
		}
		return total;
	}

}
