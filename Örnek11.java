package ornekler;
import java.util.Scanner;
public class Örnek11 {
	public static void main(String[] args) {
		//Girilen cümledeki küçük harfleri büyük harfe dönüştüren program
				Scanner tara = new Scanner(System.in);
				System.out.print("Söz sende: ");
				String text = tara.nextLine(), buyuk="";
				tara.close();
				char [] yazi = new char[text.length()];
				for (int i=0; i<text.length(); i++)
				{
					yazi[i] = text.charAt(i);
					if(Character.isLowerCase(yazi[i]))
					{
						yazi[i] = Character.toUpperCase(yazi[i]);
					}
				}
				for(int j=0; j<text.length(); j++)
					buyuk += yazi[j];
				System.out.println(buyuk);
	}
}