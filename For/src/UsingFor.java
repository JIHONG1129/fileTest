
public class UsingFor {
	public static void main(String[] args)
	{
		for(int times=0;times<5;times++)
		{
			int price=5;
			int amount=10;
			if(price>0 && amount>0)
			{
				int totalCost=price*amount;
				System.out.println(totalCost);
			}
			else
			{
				System.out.println("price和amount的值必须都大于0，否则无法计算totalCost的值。");
			}
		}
		System.out.println("for循环执行结束，结账员可以休息一下了。");
	}

}
