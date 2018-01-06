package ornekler;
import java.util.Scanner;
public class Örnek16 {
	public static void main(String[] args) {
		//Klavyeden girilen metni kelime kelime parçalayan program
		Scanner tara = new Scanner(System.in);
		System.out.print("Haydi yaz: ");
		String yaz = tara.nextLine();
		String [] parca = yaz.split(" ");
		tara.close();
		System.out.println("Cümle parçalandı. Kelimeler: ");
		for(String item : parca)
		{
			System.out.println(item);
		}
		
	}
}
