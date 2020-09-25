import java.util.Scanner;

public class LAB01 {
	
		public static void main(String[] args) {

		System.out.println("\nTask c\n");

		double a = 3;
		double b = 4;
		double c = -4;

		double answer;

		answer = Math.sqrt((b * b) - 4 * a * c);
		answer = -b + answer;
		answer = answer / (2 * a);
		System.out.println("The answer is: " +answer);

		System.out.println("\nTask D\n");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input 1st integer: ");
		
		int firstInt = in.nextInt();
		System.out.print("Input 2nd integer: ");
		int secondInt = in.nextInt();

		System.out.printf("\nSum of two integers: %d\n", firstInt + secondInt);
		System.out.printf("Difference of two integers: %d%n", firstInt - secondInt); 
		
		
			System.out.println("\nTask B\n");

		Scanner in1 = new Scanner(System.in);
		System.out.print("Input 1st integer: ");
		int firstInt1 = in1.nextInt();
		System.out.print("Input 2nd integer: ");
		int secondInt1 = in1.nextInt();
		
		System.out.print("\n");
		System.out.printf("Sum of two integers: %d%n\n", firstInt1 + secondInt1);
		System.out.printf("Difference of two integers: %d%n\n", firstInt1 - secondInt1);
		System.out.printf("Product of two integers: %d%n\n", firstInt1 * secondInt1);
		System.out.printf("Average of two integers: %.2f%n\n", (double) (firstInt1 + secondInt1) / 2);
		System.out.printf("Max integer: %d%n\n", Math.max(firstInt1, secondInt1));
		System.out.printf("Min integer: %d%n", Math.min(firstInt1, secondInt1));

	System.out.println("\nTask E\n");

		int y, u, i, d, e, f;
		int sum;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number: ");  // 12345
		
		y = scanner.nextInt();
		
		u = y / 10000;     //1
		
		i = (y % 10000) / 1000;  //2    
		
		d = ((y % 10000) % 1000) / 100;  //3
		
		e = ((y % 10000) % 100) / 10;  //4
		
		f = ((y % 10000) % 10) % 10; //5
		


		sum = u + i + d + e + f;
		
		System.out.println("The sum of total number is: "+sum);
		
		scanner.close();

		System.out.println("\n\t\tTask: A\n");

		double largePainting = 56.25;
		double smallPainting = 25.80;
		int oneDollor = 150;
		double z, x, v, r, dollorSum, rupeeSum;

		System.out.println("He sold six large paintings and three small paintings\n");

		System.out.println("Large Painting price is: " + largePainting);
		
		System.out.println("One Dollor price is: " +oneDollor+ " Rupees.");
		
		
		System.out.println("Small Painting price is: " + smallPainting);
		

		z = largePainting * 6;
		x = smallPainting * 3;

		dollorSum = z + x;
		

		r = oneDollor * 56.25 * 6;
		r = oneDollor * 25.80 * 3;

		rupeeSum = r + r;

		System.out.println("\nHe earns " + dollorSum + " Dollors and " + rupeeSum + " Pakistani Rupees total.");
	}

}

		

	