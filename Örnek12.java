package ornekler;
public class Örnek12 {
	public static void main(String[] args) {
		//Girilen 3 sayýnýn en büyüðünü bulan program
		int a=11, b=1, c=12;
		if(a==b && b==c)
			System.out.println("Sayýlar eþittir.");
		else if (b<a && c<a)
			System.out.println("En büyük sayý : " + a);
		else if (c<b && a<b)
			System.out.println("En büyük sayý : " + b);
		else
			System.out.println("En büyük sayý : " + c);
	}
}
