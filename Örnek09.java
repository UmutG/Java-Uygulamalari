package ornekler;
import java.util.Scanner;
public class Örnek09 {
	public static void main(String[] args) {
		//Klavyeden girilen sayının tek mi çift mi olduğunu belirten program
		Scanner tara = new Scanner(System.in)
		System.out.print("Sayınızı giriniz: ");
		int a = tara.nextInt();
		tara.close();
		if(a%2==0)
			System.out.print("Sayı çifttir.");
		else
			System.out.print("Sayı tektir.");
	}
}
