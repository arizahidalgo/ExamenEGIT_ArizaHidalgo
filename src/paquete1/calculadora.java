package paquete1;
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca el segundo numero");
		int n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca la operacion que quiere realizar");
		int opc= Integer.parseInt(sc.nextLine());
		switch (opc) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;

		default:
			break;
		}
		
		
		sc.close();
	}

}
