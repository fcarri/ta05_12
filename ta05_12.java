package project5;

import java.util.Scanner;

public class ta05_12 {
	public static void main(String args[]){
		
		Boolean condition = false; 
		int intentos = 3;
		int n = 0;
		final String password = "planet";		
		
		Scanner sc = new Scanner(System.in);	
				
		while ((condition == false) && (n < intentos)) {						
							
			System.out.println("Introdueix password: ");
			String pass = sc.nextLine();
				if (pass.equals(password)) {
					condition = true;					
				}								
			n++;						
		}		
		sc.close();
		if (condition == true) {
			System.out.println("Enhohabuena");
		}
	}
}
