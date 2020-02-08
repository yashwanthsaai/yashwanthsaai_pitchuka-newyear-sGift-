import java.util.*;
import sweets.*;
import Chocolates.*;
public class NewYearGift {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		inputSweets();
		inputChocolates();
		
		 
		
		
		

	}
	public static void inputSweets() {
		System.out.println("Enter the no of sweets in the gift:");
		int noOfSweets = input.nextInt();
		
		for(int sCount=0 ; sCount <noOfSweets;sCount++) {
			
			System.out.println("Enter the no of sweet you have:");
			System.out.println("1.barfi\t2.halwa\t3.laddu");
			int sweet =input.nextInt();
			switch(sweet)
			{
			case 1: System.out.println("Enter the weight and price of the barfi:");
					new barfi(input.nextInt(),input.nextInt());
					break;
					
			case 2: System.out.println("Enter the weight and price of the halwa:");
					new halwa(input.nextInt(),input.nextInt());
					break;
					
			case 3: System.out.println("Enter the weight and price of the halwa:");
					new laddu(input.nextInt(),input.nextInt());
					break;
			}
		}
		
	}
	
	public static void inputChocolates()
	{
		System.out.println("Enter the no of chocolates in the gift:");
		int noOfChocolates = input.nextInt();
		
		for(int chCount=0 ; chCount <noOfChocolates;chCount++) {
			
			System.out.println("Enter the no of chocolates you have:");
			System.out.println("1. dairyMilk\t2. fiveStar\t3. kitKat\t4. munch\t5. perk\t 6.snickers");
			int chocolate =input.nextInt();
			switch(chocolate)
			{
			case 1: System.out.println("Enter the weight and price of the dairyMilk");
					dairyMilk d = new dairyMilk(input.nextInt(),input.nextInt());
					break;
					
			case 2: System.out.println("Enter the weight and price of the fiveStar:");
					fiveStar f = new fiveStar(input.nextInt(),input.nextInt());
					break;
					
			case 3: System.out.println("Enter the weight and price of the kitKat:");
					kitKat k = new kitKat(input.nextInt(),input.nextInt());
					break;
			case 4: System.out.println("Enter the weight and price of the munch:");
			  		munch m = new munch(input.nextInt(),input.nextInt());
			  		break;		
		
			
			case 5: System.out.println("Enter the weight and price of the snickers:");
					snickers s = new snickers(input.nextInt(),input.nextInt());
					break;
					
			}
		}
	}

}
