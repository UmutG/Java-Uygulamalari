package ders1;
import java.util.Scanner;

public class d11 {

	public static void main(String[] args) {
		//Sayý ve üssünü alýp sonucu yazan program
		int a,b;
		double c=1;
		Scanner tara = new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		a = tara.nextInt();
		System.out.print("Kuvvetini giriniz: ");
		b = tara.nextInt();
		tara.close();
		for(int i=b; i>=1; i--)
		{
			if (b==0)
			{
				System.out.print(a + " üssü 0 = 1");
				break;
			}
			else
				c = c*a;
		}
		System.out.print(a + " üssü " + b + " = " + c);
		
	}

}
