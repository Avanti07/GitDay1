
package fruits;

public class FruitUtils {
	//add static counter
	public  int counter;
	/*
	 *  Add static method , addFruit to add a fruit to
	 * the Fruit Basket.
	 * 
	 */
	public  void addFruit(Fruit f,Fruit[] basket)
	{
		if(counter < basket.length)
			basket[counter++]=f;
		else
			System.out.println("Basket Full!!!!");
		System.out.println("No of objects :"+counter);
	}

}
