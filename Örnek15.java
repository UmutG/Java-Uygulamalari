package ornekler;
import java.util.Scanner;
public class Örnek15 {
	public static void main(String[] args) {
		//Klavyeden girilen metni terse çeviren program
		System.out.print("Haydi yaz: ");
		Scanner tara = new Scanner(System.in);
		String text = tara.nextLine();
		tara.close();
		System.out.println(new StringBuilder(text).reverse());
	}
}
