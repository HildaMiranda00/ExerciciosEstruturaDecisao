package decisao;
import java.util.Scanner;
public class C07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor =  new Scanner(System.in);
System.out.println("Digite um numero para base");
int a = leitor.nextInt();
System.out.println("Digite um número para o expoente");
int b = leitor.nextInt();
int i = 0;
int x = 1;
while (i < b) {
	x *= a ;
	i++;
}

System.out.println(x);
	}

}
