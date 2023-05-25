package decisao;
import java.util.Scanner;
public class C05 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	double numero;
	double media = 0;
	double soma = 0;
	int i = 0;
	while(i < 5) {
		System.out.println("Digite um número");
		numero = leitor.nextDouble();
		soma += numero;
		i++;
		media = soma / i;
	}
	leitor.close();
	System.out.print(media);
	}

}
