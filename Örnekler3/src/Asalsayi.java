import java.util.Scanner;

public class Asalsayi {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int girilensayi;
	boolean asal = true;
	
	do {
		System.out.print("Pozitif bir sayý giriniz.");
		girilensayi = scan.nextInt();
	} while (girilensayi < 2);
	for (int i = 2;i < girilensayi; i++) {
		if (girilensayi % i == 0) {
			asal = false;
			break;
		}
	}
	if(asal) {
		System.out.print("Girlen sayý :" + girilensayi +" asaldýr.");
		
	}
	else { System.out.print("Girilen sayý :" + girilensayi + "asal deðildir.");
	}
	}
}