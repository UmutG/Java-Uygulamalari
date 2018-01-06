package ornekler;
import java.util.Scanner;
public class Örnek23 {
	public static boolean asal(int y) {
            for(int j=2; j<=y/2; j++)
            {
                if(y%j==0) 
                return true;
            }
            System.out.println(y + " asal sayıdır.");
			return false;
	}
	public static void main(String[] args) {
		//Klavyeden girilen sayıdan küçük ilk asal sayıyı bulan program
		Scanner tara = new Scanner(System.in);
		int a=0;
		do
		{
			System.out.print("Sayınızı giriniz: ");
			a = tara.nextInt();
		}
		while(asal(a)==true);
		tara.close();
	}

}
