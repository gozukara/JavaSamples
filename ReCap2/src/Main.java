
public class Main {

	public static void main(String[] args) {
		// double [] mylist = new double [4];

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double enBuyuk = myList [0];

		for (double number : myList) {
			total= total + number;
			System.out.println(number);
			if (enBuyuk<number) {
				enBuyuk = number;
			}
			
			
		}
		System.out.println("Toplam="+ total);
		System.out.println("En Büyük =" + enBuyuk);
	}

}
