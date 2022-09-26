package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 21;
		int sayi2 = 22;
		int sayi3 = 23;
		
		int buyukSayi=sayi1;
		
		if(buyukSayi < sayi2) {
			
		  buyukSayi = sayi2;
		}
		
		if (buyukSayi<sayi3)
		{
			buyukSayi = sayi3;
		}
		
		
		 System.out.println("En büyük sayi = " + buyukSayi);
	}

}
