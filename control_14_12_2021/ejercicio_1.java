import java.util.Scanner;
import java.util.Random;

public class PartidaDados{
	

	public static void main(String[] args){
		String juega = "";
		int dado1=0, dado2=0, total=0;
		
		System.out.println("¿Desea comenzar la partida? (si / no)");
		Scanner scan = new Scanner(System.in);
		juega = scan.nextLine();
		
				
		while (total <=21 & juega.equals("si")){
		
			Random num1 = new Random();
			Random num2 = new Random();
			dado1 = (num1.nextInt(6) + 1);
			dado2 = (num2.nextInt(6) + 1);
			
			System.out.println("Dado 1: " + dado1);
			System.out.println("Dado 2: " + dado2);
			total = total + dado1 + dado2;
			System.out.println("Total: " + total);
			
			if (total <= 21){
				System.out.println("¿Quiere otra tirada? (si / no)");
				juega = scan.nextLine();
				if (juega.equals("no")){
				System.out.println("Fin de la partida");
				break;
				}
			} else {
				System.out.println("Ha perdido");
				System.out.println("Fin de la partida");
				break;
			}
			
		}
	}
}