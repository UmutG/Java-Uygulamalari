package ornekler;
import java.util.Scanner;
public class Örnek01 {
	public static void main(String[] args)
	{
		//Klavyeden 15 sayısı girilene kadar sayıları toplayan program
		Scanner tara = new Scanner(System.in);
		double i=0, top=0;
		do {
			System.out.print("Sayıyı giriniz: ");
			i = tara.nextDouble();
			top += i;
		}
		while (i!=15);
		tara.close();
		System.out.println("Toplam = " + top);
	}
}
