import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//leitor das entradas
		Scanner sc = new Scanner(System.in); 
			//Variavel para armazenar o intervalo
			double num = sc.nextDouble();
			//Método que irá mostrar qual intevalo está
			intervalo(num);
		
			sc.close();
	}
	
	
	/**
	 * 
	 * 
	 * @param n possivel intervalo que será investigado
	 */
	private static void intervalo(double n) {
		if(n < 0 || n > 100) {
			System.out.println("Fora de intervalo");
			return;
		}
		if(n >= 0  && n <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if(n > 25 && n <= 50) {
			System.out.println("Intervalo [25,50]");
		}else if(n > 50 && n <= 75) {
			System.out.println("Intervalo [50,75]");
		}else {
			System.out.println("Intervalo [75,100]");
			
		
		}
		
		
		
	}


}
