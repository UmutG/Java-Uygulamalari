package ornekler;
import java.util.Scanner;
public class �rnek05 {
	public static void main(String[] args) {
		int i;
		String soyle;
		Scanner tara = new Scanner(System.in);
		System.out.print("Neler s�ylemek istersiniz? : ");
		soyle = tara.nextLine();
		System.out.print("Ka� defa tekrarlans�n? : ");
		i = tara.nextInt();
		tara.close();
		for (int j=0; j<i; j++)
			System.out.println(soyle);
	}
}