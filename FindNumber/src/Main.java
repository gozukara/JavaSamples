
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int search = 5;
boolean isFound= false;

		for (int number : numbers) {
			if (number==search) {
				isFound= true;
				break;
			}
		}
		
		if (isFound) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut degildir");
		}
	}

}
