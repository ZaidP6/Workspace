package factorial;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("El factorial de 5 es : "+factorial(5));
		
	}
	
	public static int factorial(int n) {
		int resultado = 1;
		for (int i = n; i>=1 ; i--) {
			resultado = resultado *n;
		}
		return resultado;
	}
	
	

}
