
public class main {
	public static void main(String[] args) {
		
		int sayi = 2;
		int toplam = 0;
		
		while(sayi <= 100) {
			for(int i = 2; i < sayi; i++) {
				if(sayi % i == 0) {
					toplam = toplam + 1;
				}
			}
			if(toplam == 0) {
				System.out.println(sayi);
			}
			toplam = 0;
			sayi++;
		}
		System.out.println();
	}
}
