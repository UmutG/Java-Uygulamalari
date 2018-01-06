package ornekler;
import java.util.Scanner;
public class Örnek33 {
	public static void main(String[] args) {
		//Klavyeden girilen bir sayı 50 ve üstünde ise yüzde 10’nun, 50’nin altında ise yüzde 25’ini bulup ekrana yazdıran program
		Scanner tara = new Scanner(System.in);
		System.out.print("Sayınızı giriniz: ");
		int sayi = tara.nextInt();
		tara.close();
		if(sayi<50)
			System.out.println("Sayınızın %25'i: " + (sayi*0.25));
		if(sayi>=50)
			System.out.println("Sayınızın %10'u: " + (sayi*0.10));
	}
}