package ornekler;
public class �rnek12 {
	public static void main(String[] args) {
		//Girilen 3 say�n�n en b�y���n� bulan program
		int a=11, b=1, c=12;
		if(a==b && b==c)
			System.out.println("Say�lar e�ittir.");
		else if (b<a && c<a)
			System.out.println("En b�y�k say� : " + a);
		else if (c<b && a<b)
			System.out.println("En b�y�k say� : " + b);
		else
			System.out.println("En b�y�k say� : " + c);
	}
}
