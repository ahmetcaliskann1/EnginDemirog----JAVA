package arraysDemo;

public class arraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1 = "Ahmet";
		String ogrenci2 = "Salih";
		String ogrenci3 = "Kaan";
		String ogrenci4 = "Veli";
		
		
		//System.out.println(ogrenci1);
		//System.out.println(ogrenci2);
		//System.out.println(ogrenci3);
		//System.out.println(ogrenci4);
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ahmet";
		ogrenciler[1] = "Kaan";
		ogrenciler[2] = "Salih";
		
		
		for (int i=0;i<ogrenciler.length;i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
	}

}
