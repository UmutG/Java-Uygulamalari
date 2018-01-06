package ornekler;
import java.util.Scanner;
public class Örnek21 {
	public static void main(String[] args) {
		//Klavyeden girilen sayının faktöriyel değerini hesaplayan program
			Scanner tara = new Scanner(System.in);
			System.out.print("Sayı giriniz: ");
			int a = tara.nextInt();
			tara.close();
			int top=1;
			for(int i=a; i>=1; i--)
				{
					top = top * i;
				}
			System.out.print(a + "! = " + top);
	}
}
