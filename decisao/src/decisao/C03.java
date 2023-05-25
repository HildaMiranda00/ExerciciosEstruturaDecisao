package decisao;
import java.util.Scanner;
public class C03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double altura;
		double maiorAltura = 0;
		double menorAltura;
		do {
			System.out.println("Digite sua altura");
			altura = leitor.nextDouble();
			menorAltura = maiorAltura;
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}if (altura < menorAltura ) {
				
				menorAltura = altura;
			}
		} while(altura != 0);
		leitor.close();
		System.out.println("A maior altura é: " + maiorAltura);
		System.out.println("A menor altura é: " + menorAltura);
	}

	
}
