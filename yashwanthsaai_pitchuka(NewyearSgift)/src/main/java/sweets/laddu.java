package sweets;     

public class laddu extends sweet
{
	public laddu(int weight,int price)
	{
		Weight = weight;
		Price = price;
	}
	public int Weight() {
		return Weight; 
	}
	
	public int Price(int x) {
		return Price*x;
	}
}
