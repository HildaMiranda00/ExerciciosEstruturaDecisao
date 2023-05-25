package decisao;
import java.util.Scanner;
public class C04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor =  new Scanner(System.in);
		int numero;
		int i = 0;
		int maior = 0;
while (i < 50) {
	System.out.println("Digite um número");
	numero = leitor.nextInt();
	if (numero > maior)
	{
		maior = numero;
	}
	i++;
}
leitor.close();
System.out.println(maior);
	}

}
