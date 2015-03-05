/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Scanner;
public class StringBuild {
	public static void main(String[]args){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Plz enter Java is fun! ");
		String input= kbd.nextLine();
		StringBuilder s= new StringBuilder(input);
		

		s.append("!I Loves Java.");
                
                System.out.println("Plz enter Yes");
                String in = kbd.nextLine();
		s.insert(input.length(), in);
		System.out.print(s);
		
	}

}
