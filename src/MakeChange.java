import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double price = 0.0;
		double pay = 0.0;
		double change = 0.0;
		String isExit = "";

		while (true) {
			welcome();
			isExit = sc.next();
			System.out.println();
			if ("q".equals(isExit) || "Q".equals(isExit)) {
				System.out.println("Exit from the make change system, welcome to come again!");
				break;
			}
			System.out.print("What is the price of the item? ");
			price = sc.nextDouble();
			System.out.print("How much money was tendered by the customer? ");
			pay = sc.nextDouble();

			if (price > pay) {
				System.out.println("The money tendered is not adequate, can't make change for you!");
				System.out.println();
				continue;
			}else if(price == pay) {
				System.out.println("The money tendered is exact the same as the item price, perfect!");
				System.out.println();
				continue;
			}
			change = pay - price + 0.0001;
			printChange(change);
		}

		sc.close();
	}

	public static void welcome() {
		System.out.println("--------------------------------------------");
		System.out.println("$    Welcome to make change system!      $");
		System.out.println("--------------------------------------------");
		System.out.print("     Enter y/Y to continue, q/Q to exit:   ");
	}

	public static void printChange(double change) {
		int twentyCount = 0;
		int tenCount = 0;
		int fiveCount = 0;
		int oneCount = 0;
		int quarterCount = 0;
		int dimeCount = 0;
		int nickelCount = 0;
		int pennyCount = 0;

		System.out.print("Change: ");
		if (change >= 20) {
			twentyCount = (int) (change / 20);
			change %= 20;
			if (twentyCount != 0) {
				System.out.print(twentyCount + " twenty dollar bill ");
			}
		}
		if (change >= 10) {
			tenCount = (int) (change / 10);
			change %= 10;
			if (tenCount != 0) {
				System.out.print(tenCount + " ten dollar bill ");
			}
		}
		if (change >= 5) {
			fiveCount = (int) (change / 5);
			change %= 5;
			if (fiveCount != 0) {
				System.out.print(fiveCount + " five dollar bill ");
			}
		}
		if (change >= 1) {
			oneCount = (int) (change / 1);
			change %= 1;
			if (oneCount != 0) {
				System.out.print(oneCount + " one dollar bill ");
			}
		}
		if (change >= 0.25) {
			quarterCount = (int) (change / 0.25);
			change %= 0.25;
			if (quarterCount != 0) {
				System.out.print(quarterCount + " quarter ");
			}
		}
		if (change >= 0.1) {
			dimeCount = (int) (change / 0.1);
			change %= 0.1;
			if (dimeCount != 0) {
				System.out.print(dimeCount + " dime ");
			}
		}
		if (change >= 0.05) {
			nickelCount = (int) (change / 0.05);
			change %= 0.05;
			if (nickelCount != 0) {
				System.out.print(nickelCount + " nickel ");
			}
		}
		if (change >= 0.01) {
			pennyCount = (int) Math.round(change / 0.01);
			change %= 0.01;
			if (pennyCount != 0) {
				System.out.print(pennyCount + " penny ");
			}
		}
		System.out.println();
		System.out.println();
	}

}
