package decisao;
import java.util.Scanner;
public class C06 {
	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
System.out.println("Digite um numero");
int a = leitor.nextInt();
System.out.println("Digite um número");
int b = leitor.nextInt();
int i = a;
while (i <= b) {
	System.out.println(i);
	i++;
}

}
}