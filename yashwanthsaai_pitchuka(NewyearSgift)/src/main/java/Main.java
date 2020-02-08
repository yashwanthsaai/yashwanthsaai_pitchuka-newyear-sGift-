import java.util.Scanner;

import Chocolates.*;
import sweets.*;
public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int j = input.nextInt();
		System.out.println(j);
		int TotalWeight = 0;
		int TotalPrice = 0;
		String[] gift = {"dairyMilk","snickers","fiveStar","kitKat","laddu","barfi"} ;
		String chocolate = new String();

		for(int i=0;i<gift.length; i++){
			int indiWeight =0;
			int indiPrice =0;
			chocolate = gift[i];
			
			switch (chocolate)
			{

				case "dairyMilk":
					System.out.println("Enter the weight and price of the dairyMilk:");
					dairyMilk d = new dairyMilk(input.nextInt(),input.nextInt());
					indiWeight += d.Weight() ; 
					indiPrice = d.Price();
					break;

				case "fiveStar":
					System.out.println("Enter the weight and price of the fiveStar:");
					fiveStar f = new fiveStar(input.nextInt(),input.nextInt()); 
					indiWeight += f.Weight();
					indiPrice = f.Price();
					break;

				case "snickers" :
					System.out.println("Enter the weight and price of the Snickers:");
					snickers s = new snickers(input.nextInt(),input.nextInt());
					indiWeight += s.Weight();
					indiPrice = s.Price();
					break;

				case "munch"	:
					System.out.println("Enter the weight and price of the munch:");
					munch m = new munch(input.nextInt(),input.nextInt());
					indiWeight += m.Weight();
					indiPrice += m.Price();
					break;

				case "kitKat"   :
					System.out.println("Enter the weight and price of the kitKat:");
					kitKat k = new kitKat(input.nextInt(),input.nextInt());
					indiWeight += k.Weight();
					indiPrice = k.Price();
					break;

				case "laddu" 	:
					System.out.println("Enter the weight and price of the laddu:");
					laddu l  = new laddu(input.nextInt(),input.nextInt());
					indiWeight += l.Weight();
					indiPrice = l.Price();

				case "barfi":
					System.out.println("Enter the weight and price of the barfi:");
					barfi g = new barfi(input.nextInt(),input.nextInt());
					indiWeight += g.Weight();
					indiPrice = g.Price();

			}

			System.out.println(chocolate+" weight and price is : "+indiWeight+" , "+indiPrice);
			TotalWeight += indiWeight;
			TotalPrice += indiPrice;
		}
		System.out.println("TotalWeight : "+TotalWeight);
		System.out.println("TotalPrice  : "+TotalPrice);
	}
	
	
	
				
	

}
