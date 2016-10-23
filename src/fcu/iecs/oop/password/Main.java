package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		PasswordEncorder encorder = new PasswordEncorder();
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int flag=1;
		while(flag==1){
			System.out.print("Please enter a password: ");
			String n = keyboard.next();
			if(!n.equalsIgnoreCase("exit")){
				encorder.enc(n);
			}
			else 
				break;
		}
	}
}
