package ornekler;
import java.util.Scanner;
public class Örnek05 {
	public static void main(String[] args) {
		//Klavyeden girilen bir ifadeyi istenen sayı kadar ekrana yazan program
		int i;
		String soyle;
		Scanner tara = new Scanner(System.in);
		System.out.print("Neler söylemek istersiniz? : ");
		soyle = tara.nextLine();
		System.out.print("Kaç defa tekrarlansýn? : ");
		i = tara.nextInt();
		tara.close();
		for (int j=0; j<i; j++)
			System.out.println(soyle);
	}
}
