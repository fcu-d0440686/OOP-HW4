package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida Tiida = new NissanTiida();
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int num = keyboard.nextInt();
		for(int i = 1;i<=num;i++){
			Tiida.tiida(i);
		}
	}

}
