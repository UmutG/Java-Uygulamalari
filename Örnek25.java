package ornekler;
import java.util.Scanner;
public class Örnek25 {
	public static void main(String[] args) {
		//Klavyeden girilen iki tamsayının ortak katlarının en küçüğünü hesaplayan program
		Scanner tara = new Scanner(System.in);
		int s1, s2;
		System.out.print("1. sayıyı giriniz: ");
		s1 = tara.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		s2 = tara.nextInt();
		tara.close();
		for(int i=1; i<=s1*s2; i++)
		{
			if(i%s1==0 && i%s2==0)
			{
				System.out.println("Ortak katlarının en küçüğü: " + i);
				break;
			}
		}
	}
}