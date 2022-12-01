import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int baseNumber, temp, digitCount = 0, total = 0, temp2 = 1, base = 1, sum = 0;

		System.out.println("Bir Sayı Giriniz: ");
		baseNumber = sc.nextInt();
		boolean isZero = false;
		temp = baseNumber;
		temp2 = baseNumber;

		while (!isZero) {
			temp /= 10;
			digitCount++;
			if (temp == 0) {
				isZero = true;
			}
		}
		for (int i = 1; i <= digitCount; i++) {
			base = temp2 % 10;
			int j = 1;
			temp = 1;
			for (j = 1; j <= digitCount; j++) {
				temp *= base;
			}
			sum += base;
			temp2 /= 10;
			total = total + temp;
		}
		if(baseNumber == total) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("This not Armstrong Number");
		}
		
	}
}
