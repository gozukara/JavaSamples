
public class Main {

	public static void main(String[] args) {
	/*	char harf = 'ö';
		char[] kalinSes = { 'A',  'o', 'u','d' };

		char [] inceSes = {'e', 'i', 'ö', 'ü'};
	
		//boolean seslimi = true;
		
	for (int i =0; i<4; i++) {
		if (harf == kalinSes [i]) {
			//seslimi= true;
			System.out.println("Kalin sesli harftir");
			return;
		} else if (harf == inceSes [i]) {
			System.out.println("ince seslidir");
			break;
			
		} else {
			System.out.println("sessiz harftir");
		
		}*/
		
		char harf = 'E';
		switch (harf) {
		case 'A':
		case 'I':
		case 'o':
		case 'u':
			System.out.println("kalin seslidir");
			break;
			default :
				System.out.println("ince sesli harf");
			
		
		
		
	}
		
		
	}

}
