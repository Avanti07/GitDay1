package tester;

import java.util.Scanner;
import fruits.*;
//import static -- to access all static members directly 
import  static fruits.FruitUtils.*;
import static java.lang.System.*;

public class CreateFruitBasket {

	public static void main(String[] args) {
		// sc
		Scanner sc = new Scanner(in);
		FruitUtils fru = new FruitUtils();
		out.println("Enter size of basket");
		// create suitable array to holde ANY type of a fruit
		Fruit[] fruits = new Fruit[sc.nextInt()];
		boolean exit = false;
		while (!exit) {
			out.println("1 : Apple \n 2:Orange \n 3: Cherry 4 : Display n Exit");
			System.out.println("Enter option");
			switch (sc.nextInt()) {
			case 1: // add apple
				Apple a = new Apple();
				//System.out.println("No of apple instances :"+Apple.getNoOfInstances());
				fru.addFruit(a, fruits);
				break;
			case 2: // add orange
				fru.addFruit(new Orange(), fruits);
				break;
			case 3: // add cherry
				fru.addFruit(new Cherry(), fruits);
				break;
			case 4: //display taste of all fruits in d basket
				for(Fruit f : fruits)//f=fruits[0]
					f.taste();
				exit = true;
				break;
			}
			
		}

	}

}
