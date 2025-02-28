import java.util.Scanner;
public class A023{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int suma,entero;
	
		System.out.println("introduce entero");
		entero=teclado.nextInt();
		suma=entero*(entero+1)/2;
		System.out.println(suma ); 
	}
}
