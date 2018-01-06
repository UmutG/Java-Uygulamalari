package ornekler;
import java.util.Scanner;
public class Örnek30 {
	public static int bak(String str) {
		int say=0;
		for(int i=0; i<str.length(); i++) {
			if(((char)str.charAt(i)) >= 'A' && (char)str.charAt(i) <= 'Z'
					|| (char)str.charAt(i) >= 'a' && (char)str.charAt(i) <= 'z')
				say++;
			}
		return say;
	}
	public static void main(String[] args) {
		//Klavyeden girilen bir kelimenin kaç harf olduğunu gösteren program
		//Türkçe karakterlere duyarsızdır.
		Scanner tara = new Scanner(System.in);
		System.out.print("Mikrofon sende: ");
		String a = tara.nextLine();
		tara.close();
		System.out.println("Cümlede " + bak(a) + " harf var.");
		
	}

}
