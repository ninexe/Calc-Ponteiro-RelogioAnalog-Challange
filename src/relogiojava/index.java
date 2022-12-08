package relogiojava;

import java.util.Scanner;

import relogiojava.relogio;

public class index {
	
	static Scanner input = new Scanner(System.in);
	static int iMin;
	static int iHour;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Seja bem-vindo a Calculadora de angulo de Relogio Analogico! :D ");
		System.out.println("Digite um valor entre 1 e 12: ");
		iHour = input.nextInt();
		System.out.println("Digite um valor entre 0 e 59: ");
		iMin = input.nextInt();
		System.out.println("Hora: " + iHour + ":" + iMin);
		
		if(iHour > 12 || iHour < 1 || iMin > 59 || iMin < 0) {
			System.out.println("Hora ou minuto incorreto, tente novamente!" );
			System.exit(0);
		}else {
			relogio relogioAnalogico = new relogio();
			int calcAng = relogioAnalogico.retornaAnguloRelogio(iHour, iMin);
			System.out.println("O angulo calculado entre os ponteiros de hora e minuto é: " + calcAng);
		}
	}
}
