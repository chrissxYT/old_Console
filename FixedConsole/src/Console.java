import java.util.Scanner;

public class Console {

    static void out(String msg) {
    	System.out.println(msg);
    }
    
    static void err(String msg) {
    	System.err.println("[ERROR] " + msg);
    }
    
    static void exit(Scanner s)
    {
    	s.close();
    	System.exit(0);
    }
    
    public static void main(String[] args) throws InterruptedException {
		err("Willkommen in der Java-Console!");
		err("Du kannst alle Zahlen in ENG und DE anzeigen lassen gib also 'eins' ein, und in der nächsten Zeile erscheint '1'!");
		err("Du kannst aber auch noch viel mehr machen, gib einfach mal irgendwas ein, was in dem Thema im BisaBoard steht!");
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			String[] in = s.nextLine().split(" ");
			String c = in[0];
			
			if(c.equalsIgnoreCase("exit") || c.toLowerCase().startsWith("scheiß") || c.equalsIgnoreCase("stop!!!")) {
				err("exit Programm");
				exit(s);
			} else if (c.equalsIgnoreCase("echo")) {
				if(in.length > 1)
					for (int i = 1; i < in.length; i++)
						out(in[i] + " ");
				else
					err("Error: 'echo' needs 1 or more arguments!");
			} else if (c.equalsIgnoreCase("ääähhh...")) {
				out("Was? (Antwort bitte mir per PN schicken!)");
			} else if (c.equalsIgnoreCase("arg")) {
				out("Wieso (WISO ha, ha, ha!) schreibst du das?!? (Antwort bitte mir per PN schicken!)");
			} else if (c.equalsIgnoreCase("Wie")) {
				if (in[1].equalsIgnoreCase("viele") && in[2].equalsIgnoreCase("Zeilen") && in[3].equalsIgnoreCase("hat") && in[4].equalsIgnoreCase("dein") && in[5].equalsIgnoreCase("Quellcode?"))
						out("~120");
				else
					out("Schick mir deine Frage bitte per PN!");
			} else if (c.equalsIgnoreCase("null")) {
				out("0");
			} else if (c.equalsIgnoreCase("")) {
				err("Keinen Befehl gefunden!");
			} else if (c.equalsIgnoreCase("cmd")) {
				err("Java-Console aus Eclipse von Christian Häußler ist viel besser, als lahmes cmd!!!!!!!!!! Grrrrrrrrrrrrrrrrr!!!");
				err("EXIT PROGRAMM!!!");
				exit(s);
			} else if (c.equalsIgnoreCase("eins") || c.equalsIgnoreCase("one"))
				out("1");
			else if (c.equalsIgnoreCase("zwei") || c.equalsIgnoreCase("two"))
				out("2");
			else if (c.equalsIgnoreCase("drei") || c.equalsIgnoreCase("three"))
				out("3");
			else if (c.equalsIgnoreCase("vier"))
				out("Kla4 = Klavier");
			else if (c.equalsIgnoreCase("four"))
				out("4");
			else if (c.equalsIgnoreCase("fünf") || c.equalsIgnoreCase("five"))
				out("5");
			else if (c.equalsIgnoreCase("sechs") || c.equalsIgnoreCase("six"))
				out("6");
			else if (c.equalsIgnoreCase("sieben") || c.equalsIgnoreCase("seven"))
				out("7");
			else if (c.equalsIgnoreCase("acht") || c.equalsIgnoreCase("eight"))
				out("8");
			else if (c.equalsIgnoreCase("nine") || c.equalsIgnoreCase("neun"))
				out("9");
			else if (c.equalsIgnoreCase("zehn") || c.equalsIgnoreCase("ten"))
				out("10");
			else if (c.equalsIgnoreCase("!"))
				out("Hallo!");
			else if (c.equalsIgnoreCase("M"))
				out("Milza, Milza!");
			else if (c.equals("X"))
				out("XD");
			else if (c.equals("x"))
				out("xD");
			else if (c.equalsIgnoreCase("O"))
				out("Ottaro ist schwach!");
			else if (c.equalsIgnoreCase("Z"))
				out("Zurrokex ist schwach!");
			else if (c.equalsIgnoreCase("A"))
				out("Albert E.");
			else if (c.equalsIgnoreCase("Playstation"))
				out("ist blöd!");
			else if (c.equalsIgnoreCase("X-Box"))
				out("ist nicht toll!");
			else if (c.equalsIgnoreCase("?"))
				out("Weißt du, wie ich heiße?");
			else if (c.equalsIgnoreCase("christian_häußler"))
				out("Stimmt, so heiße ich!");
			else if (c.equalsIgnoreCase("BB"))
				out("Meinst du BisaBoard oder BurningBoard?");
			else if (c.equalsIgnoreCase("bisaboard"))
				out("Und wie heiße ich dort?");
			else if (c.equalsIgnoreCase("chrissicx[milza]"))
				out("Stimmt, so heiße ich im BisaBoard!");
			else if (c.equalsIgnoreCase("burningboard"))
				out("ist die Forensoftware von BisaBoard!");
			else if (c.equalsIgnoreCase("push"))
				out("Und hoch mit dir!");
			else if (c.equalsIgnoreCase("push#1000000") || c.equalsIgnoreCase("push#1.000.000"))
				err("Keine Kunden?");
			else {
				err("Was gibst du denn für einen Quatsch ein?!?!?!?!?!?");
				Thread.sleep(100);
				err("Ich schließe dann mal das Programm!!!");
				Thread.sleep(100);
				exit(s);
			}
		}
	}
}
