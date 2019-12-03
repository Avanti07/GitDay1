package fruits;

public class Apple extends Fruit {

	private static int count=0;
	public Apple()
	{
		super();
		count++;
	}
	public void taste()
	{
		System.out.println("Apple has sweet taste");
	}
	
	public static int getNoOfInstances() {
		return count;
	}
	

}
