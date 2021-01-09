package Static;

public class TesteCalculadora {
	
	static void imprimirTela(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.dividir(10, 2));
		imprimirTela(Calculadora.somatorio(5));
		
		Contador cont = new Contador();
		
	
		System.out.println(cont.obterValor());
		

	}
	

}

