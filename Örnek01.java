package ornekler;
import java.util.Scanner;
public class Örnek01 {
	public static void main(String[] args)
	{
		//Klavyeden 15 sayýsý girilene kadar sayýlarý toplayan program
		Scanner tara = new Scanner(System.in);
		int i=0, top=0;
		do {
			System.out.print("Sayýyý giriniz: ");
			i = tara.nextInt();
			top += i;
		}
		while (i!=15);
		tara.close();
		System.out.println("Toplam = " + top);
	}
}
