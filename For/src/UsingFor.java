
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
				System.out.println("price��amount��ֵ���붼����0�������޷�����totalCost��ֵ��");
			}
		}
		System.out.println("forѭ��ִ�н���������Ա������Ϣһ���ˡ�");
	}

}
