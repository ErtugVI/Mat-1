import java.util.Scanner;

public class Asalsayi {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int girilensayi;
	boolean asal = true;
	
	do {
		System.out.print("Pozitif bir say� giriniz.");
		girilensayi = scan.nextInt();
	} while (girilensayi < 2);
	for (int i = 2;i < girilensayi; i++) {
		if (girilensayi % i == 0) {
			asal = false;
			break;
		}
	}
	if(asal) {
		System.out.print("Girlen say� :" + girilensayi +" asald�r.");
		
	}
	else { System.out.print("Girilen say� :" + girilensayi + "asal de�ildir.");
	}
	}
}