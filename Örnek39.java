package ornekler;
public class Örnek39 {
	public static void main(String[] args) {
		//1'den 10'a çarpım tablosu
		for (int i = 1; i<=10; i++){
			System.out.println("-------------");
			for (int j = 1; j<=10; j++)
				System.out.println(i + " x " + j + " = " + (i*j));
			}
	}
}