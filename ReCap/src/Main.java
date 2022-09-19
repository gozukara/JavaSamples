
public class Main {

	public static void main(String[] args) {
		
	int sayi1 = 34;
	int sayi2 =15;
	int sayi3 = 28;
	int enBuyuk = sayi1;
	
	if (enBuyuk<sayi2) {
		enBuyuk = sayi2;
	}
	
	if (enBuyuk < sayi3) {
		enBuyuk = sayi3;
	}
	System.out.println("En Büyük =" + enBuyuk);
	
	/*String mesaj = "En büyük sayi :";
	
	if (sayi1>sayi2 & sayi2>=sayi3)	{
		System.out.println(mesaj+ sayi1);
		
	}else if (sayi2>sayi1 & sayi1>=sayi3) {
		System.out.println(mesaj + sayi2);
	}else {
		System.out.println(mesaj + sayi3);
	}
	*/
		

	}

}
