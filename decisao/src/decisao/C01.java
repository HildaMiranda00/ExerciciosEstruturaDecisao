package decisao;
import java.util.Scanner; 
public class C01 {
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		int numero;
	
		
		do {
			System.out.println("Digite um número");
			numero = leitor.nextInt(); 
			System.out.println("Número " + ": " + numero);
			
		} while(numero >= 0);
		
		leitor.close();
	}
}