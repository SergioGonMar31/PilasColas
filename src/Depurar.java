import java.util.Scanner;
public class Depurar {

	//Depura los números enteros
	public static int entero(String texto, Scanner sc) {
		boolean valido=false;
		int n=0;
		while(!valido) {
			try {
				System.out.println(texto);
				n=Integer.parseInt(sc.nextLine());
				valido=true;
			}catch(NumberFormatException e) {
				System.err.println("Error");
			}
		}
		return n;
	}

	//Depura los números decimales
	public static Double decimal(String texto, Scanner sc) {
		boolean valido=false;
		double n=0;
		while(!valido) {
			try {
				System.out.println(texto);
				n=Double.parseDouble(sc.nextLine());
				valido=true;
			}catch(NumberFormatException e) {
				System.err.println("Error");
			}
		}
		return n;
	}

	//Depura para que el String no pueda estar vacio
	public static String texto(String texto, Scanner sc) {
		String n="";
		do {
			System.out.println(texto);
			n=sc.nextLine();
		}while(n.isEmpty());
		return n;
	}

}
