package decisao;
import java.util.Scanner;
public class C8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int usuario1;
		int usuario2;
		System.out.println("Digite um número para ser advinhado");
		usuario1 = leitor.nextInt();
do  {
	System.out.println("Tente advinhar o número escolhido pelo primeiro usuário");
	usuario2 = leitor.nextInt();
	if (usuario2 < usuario1) {
		System.out.println("O seu número foi menor que o meu");
	} else if(usuario2 > usuario1) {
		System.out.println("O seu número foi maior que o meu");
	}else {
		System.out.println("Parabéns! Você certou o número.");
	}
} while (usuario2 != usuario1);
leitor.close();
	}

}
