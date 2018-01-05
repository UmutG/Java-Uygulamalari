package ornekler;
import java.util.Scanner;
public class Örnek07 {
	public static void main(String[] args) {
		//Klavyeden okunan en fazla 4 basamaklý bir pozitif tam sayýnýn çarpanlarýna ayýran program
		int sayi,say=0;
		Scanner tara = new Scanner(System.in);
		do {
			sayi=0;
			System.out.print("En fazla 4 basamaklý sayý giriniz: ");
			sayi = tara.nextInt();
		}
		while(String.valueOf(sayi).length() > 4);
		tara.close();
		for(int i=1; i<=sayi ;i++)
		{
			if(sayi%i==0)
			{
				say++;
				System.out.println((say) + ". çarpan = " + i);
			}
		}
	}
}