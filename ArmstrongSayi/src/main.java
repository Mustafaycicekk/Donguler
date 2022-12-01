import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		int number = sc.nextInt();

		int basNumber = 0;
		int tempNumber = number;
		int basValue;
		int result = 0;
		int basPow;

		while (tempNumber != 0) {
			number /= 10;
			basNumber++;
		}

		tempNumber = number;
		while (tempNumber != 0) {
			basValue = tempNumber % 10;
			basPow = 1;
			for (int i = 1; i <= basNumber; i++) {
				basPow *= basValue;
			}
			result += basPow;
			tempNumber /= 10;
		}
		if (result == number) {
			System.out.println(number + "SAyısı Armstrong Sayıdır");
		} else {
			System.out.println("Armstrong Sayısı Değildir");
		}

	}
}
