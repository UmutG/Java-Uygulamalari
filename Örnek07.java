package ornekler;
import java.util.Scanner;
public class Örnek07 {
	public static void main(String[] args) {
		//Klavyeden okunan en fazla 4 basamaklı bir pozitif tam sayının çarpanlarına ayıran program
		int sayi;
		Scanner tara = new Scanner(System.in);
		do {
			sayi=0;
			System.out.print("En fazla 4 basamaklı sayı giriniz: ");
			sayi = tara.nextInt();
		}
		while(String.valueOf(sayi).length() > 4);
		tara.close();
		for(int i=2; i<=sayi/2;i++)
		{
			if(sayi%i==0)
			{
				System.out.println(i + " x " + (sayi/i) + " = " + sayi);
			}
		}
	}
}
