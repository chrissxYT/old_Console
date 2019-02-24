package org.chrissicx.console;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.err.println("Willkommen in der Java-Console!");

		System.err.println("Du kannst alle Zahlen in ENG und DE anzeigen lassen gib also 'eins' ein, und in der nächsten Zeile erscheint '1'!");
		
		System.err.println("Du kannst aber auch noch viel mehr machen, gib einfach mal irgendwas ein, was in dem Thema im BisaBoard steht!");
		
		final Scanner sc = new Scanner(System.in);
		
		while (true) {
			String in = sc.nextLine();
			String[] ain = in.split(" ");
			String cmd = ain[0];
			
			if(cmd.equalsIgnoreCase("exit")) {
				System.err.println("exit Programm");
				System.exit(0);
			} else if (cmd.equalsIgnoreCase("echo")) {
			if(ain.length > 1) {
				for (int i = 1; i < ain.length; i++) { 
					System.out.print(ain[i] + " ");
					
				}
			} else {
				System.err.println("Error: 'echo' needs 1 or more arguments!");
			}
			
			
			} else if (cmd.equalsIgnoreCase("ääähhh...")) {
				System.out.println("Was? (Antwort bitte mir per PN schicken!)");
				
			} else if (cmd.equalsIgnoreCase("arg")) {
				System.out.println("Wieso (WISO ha, ha, ha!) schreibst du das?!? (Antwort bitte mir per PN schicken!)");
				
			} else if (cmd.equalsIgnoreCase("Wie")) {
				if (ain[1].equalsIgnoreCase("viele")) {
				if (ain[2].equalsIgnoreCase("Zeilen")) {
				if (ain[3].equalsIgnoreCase("hat")) {
				if (ain[4].equalsIgnoreCase("dein")) {
				if (ain[5].equalsIgnoreCase("Quellcode?")) {
				System.out.println("402");
				}
				
				} else {
				System.out.println("Schick mir deine Frage bitte per PN!");
				
				} 
				
				} else {
				System.out.println("Schick mir deine Frage bitte per PN!");
				
				}
				
				} else {
				System.out.println("Schick mir deine Frage bitte per PN!");
				
				
				}
				
				} else {
				System.out.println("Schick mir deine Frage bitte per PN!");
				
				}
				
			
			} else if (cmd.equalsIgnoreCase("null")) {
				System.out.println("0");
			
			} else if (cmd.equalsIgnoreCase("")) {
				System.err.println("Keinen Befehl gefunden!");
				
			} else if (cmd.equalsIgnoreCase("cmd")) {
				System.err.println("Java-Console aus Eclipse von Christian Häußler ist viel besser, als lahmes cmd!!!!!!!!!! Grrrrrrrrrrrrrrrrr!!!");
				System.err.println("EXIT PROGRAMM!!!");
				System.exit(0);
			
			} else if (cmd.equalsIgnoreCase("eins")) {
				System.out.println("1");
				
			} else if (cmd.equalsIgnoreCase("one")) {
				System.out.println("1");
				
			} else if (cmd.equalsIgnoreCase("zwei")) {
				System.out.println("2");
				
			} else if (cmd.equalsIgnoreCase("two")) {
				System.out.println("2");
				
			} else if (cmd.equalsIgnoreCase("drei")) {
				System.out.println("3");
				
			} else if (cmd.equalsIgnoreCase("three")) {
				System.out.println("3");
				
			} else if (cmd.equalsIgnoreCase("vier")) {
				System.out.println("Kla4 = Klavier");
				
			} else if (cmd.equalsIgnoreCase("four")) {
				System.out.println("4");
				
			} else if (cmd.equalsIgnoreCase("fünf")) {
				System.out.println("5");
				
			} else if (cmd.equalsIgnoreCase("five")) {
				System.out.println("5");
				
			} else if (cmd.equalsIgnoreCase("sechs")) {
				System.out.println("6");
				
			} else if (cmd.equalsIgnoreCase("six")) {
				System.out.println("6");
				
			} else if (cmd.equalsIgnoreCase("sieben")) {
				System.out.println("7");
				
			} else if (cmd.equalsIgnoreCase("seven")) {
				System.out.println("7");
				
			} else if (cmd.equalsIgnoreCase("acht")) {
				System.out.println("8");
				
			} else if (cmd.equalsIgnoreCase("eight")) {
				System.out.println("8");
				
			} else if (cmd.equalsIgnoreCase("nine")) {
				System.out.println("9");
				
			} else if (cmd.equalsIgnoreCase("neun")) {
				System.out.println("9");
				
			} else if (cmd.equalsIgnoreCase("zehn")) {
				System.out.println("10");
				
			} else if (cmd.equalsIgnoreCase("ten")) {
				System.out.println("10");
				
			} else if (cmd.equalsIgnoreCase("!")) {
				System.out.println("Hallo!");
				
			} else if (cmd.equalsIgnoreCase("M")) {
				System.out.println("Milza, Milza!");
				
			} else if (cmd.equals("X")) {
				System.out.println("XDDDDD");
				
			} else if (cmd.equals("x")) {
				System.out.println("xDDDDD");
				
			} else if (cmd.equalsIgnoreCase("O")) {
				System.out.println("Ottaro ist schwach!");
				
			} else if (cmd.equalsIgnoreCase("Z")) {
				System.out.println("Zurrokex ist schwach!");
				
			} else if (cmd.equalsIgnoreCase("A")) {
				System.out.println("Albert E.");
				
			} else if (cmd.equalsIgnoreCase("Playstation")) {
				System.out.println("ist blöd!");
				
			} else if (cmd.equalsIgnoreCase("X-Box")) {
				System.out.println("ist nicht toll!");
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Console!!!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Console!!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Console!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Console")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Programm")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Programm!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Programm!!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß_Programm!!!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("Scheiß")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else if (cmd.equalsIgnoreCase("?")) {
				System.out.println("Weißt du, wie ich heiße?");
				
			} else if (cmd.equalsIgnoreCase("Christian_Häußler")) {
				System.out.println("Stimmt, so heiße ich!");
				
			} else if (cmd.equalsIgnoreCase("BB")) {
				System.out.println("Meinst du BisaBoard oder BurningBoard?");
				
			} else if (cmd.equalsIgnoreCase("BisaBoard")) {
				System.out.println("Und wie heiße ich dort?");
				
			} else if (cmd.equalsIgnoreCase("chrissicx[Milza]")) {
				System.out.println("Stimmt, so heiße ich im BisaBoard!");
				
			} else if (cmd.equalsIgnoreCase("BurningBoard")) {
				System.out.println("ist die Forensoftware von BisaBoard!");
				
			} else if (cmd.equalsIgnoreCase("Push")) {
				System.out.println("Und hoch mit dir!");
				
			} else if (cmd.equalsIgnoreCase("Push#1000000")) {
				System.err.println("Keine Kunden?");
				
			} else if (cmd.equalsIgnoreCase("Push#1.000.000")) {
				System.err.println("Keine Kunden?");
				
			} else if (cmd.equalsIgnoreCase("STOP!!!")) {
				System.err.println("exit Programm");
				System.exit(0);
				
			} else {
		System.err.println("Was gibst du denn für einen Quatsch ein?!?!?!?!?!?");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.err.println("Ich schließe dann mal das Programm!!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.err.println("exit Programm");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.exit(0);
			}
		}
	}
}
