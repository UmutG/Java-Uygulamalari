package ornekler;
public class Örnek17 {
	public static boolean siralimi(int[] data) {
		for(int i=1; i<data.length; i++)
			if(data[i-1]<=data[i])
				return false;
		return true;
	}
	public static void main(String[] args) {
		//int türden bir dizinin küçükten büyüğe göre sıralı olup olmadığını sınayan program
		int [] dizi = {11,12,13,20};
		if(siralimi(dizi)==false)
			System.out.println("Dizi sıralı.");
		else
			System.out.println("Dizi sırasız.");
	}
}