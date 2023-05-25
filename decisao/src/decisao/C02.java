package decisao;
import java.util.Scanner;
public class C02 {

public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int numero;
	do {
		System.out.println("Digite um número de 0-10");
		numero = leitor.nextInt();
		if (numero >= 1 && numero <= 10 ) {
			System.out.println(numero);
		}else {
			System.out.println("Número inválido! Digite um número entre 0-10.");
		}
	}
		while (numero < 1 || numero > 10);
		leitor.close();
	
	}
}


