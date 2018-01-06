package ornekler;
import java.util.Scanner;
public class Örnek28 {
	public static int reverse(int n)
	{
	    int gec = 0;
	    int say = 0;
	    while(n != 0)
	    {
	        if(n%10 == 0)
	        	say++;
	        gec = gec*10 + n%10;
	        n /= 10;
	    }
	    for(int i = 0; i < say; i++)
	        System.out.print(0);
		return gec;
	}
	public static void main(String[] args) {
		//Klavyeden girilen sayının palindrom olup olmadığını söyleyen program
		Scanner tara = new Scanner(System.in);
		System.out.println("Sayınızı giriniz: ");
		int a = tara.nextInt();
		tara.close();
		if(a == reverse(a))
		{
			System.out.println("Sayınız palindromdur.");
		}
		else
			System.out.println("Sayınız palindrom değildir.");
	}
}