import java.util.Scanner;

public class Programa {
	
	public static void main(String args[]) {
		System.out.println("VAMOS A JUGAR");
		Scanner scan = new Scanner(System.in);
		boolean jugar = true;
		while(jugar) {
			System.out.print("Dime un numero del 1 al 10: ");
			int num = scan.nextInt();
			int adivinar = 1 + (int)(10.0 * Math.random());
			if (num == adivinar)
				System.out.println("¡Acertaste! :D");
			else
				System.out.println("!No! Era el" + adivinar);
			if(num <=0)
				System.out.println("Adios...");
		}
	}

}
