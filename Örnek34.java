package ders1;
import java.util.Scanner;

public class d11 {

	public static void main(String[] args) {
		//Say� ve �ss�n� al�p sonucu yazan program
		int a,b;
		double c=1;
		Scanner tara = new Scanner(System.in);
		System.out.print("Say� giriniz: ");
		a = tara.nextInt();
		System.out.print("Kuvvetini giriniz: ");
		b = tara.nextInt();
		tara.close();
		for(int i=b; i>=1; i--)
		{
			if (b==0)
			{
				System.out.print(a + " �ss� 0 = 1");
				break;
			}
			else
				c = c*a;
		}
		System.out.print(a + " �ss� " + b + " = " + c);
		
	}

}
