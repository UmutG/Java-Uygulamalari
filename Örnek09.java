package ornekler;
import java.util.Scanner;
public class Örnek09 {
	public static void main(String[] args) {
		//Klavyeden girilen sayýnýn tek mi çift mi olduðunu belirten programý
		Scanner tara = new Scanner(System.in);
		System.out.print("Sayýnýzý giriniz: ");
		int a = tara.nextInt();
		tara.close();
		if(a%2==0)
			System.out.print("Sayý çifttir.");
		else
			System.out.print("Sayý tektir.");
	}
}
