package ornekler;
import java.util.Scanner;
public class �rnek09 {
	public static void main(String[] args) {
		//Klavyeden girilen say�n�n tek mi �ift mi oldu�unu belirten program�
		Scanner tara = new Scanner(System.in);
		System.out.print("Say�n�z� giriniz: ");
		int a = tara.nextInt();
		tara.close();
		if(a%2==0)
			System.out.print("Say� �ifttir.");
		else
			System.out.print("Say� tektir.");
	}
}
