class P
{
	void Property()
	{
		System.out.println("Cash");
	}
	void marry()
	{
		System.out.println("Archana");
	}
}
class C extends P
{
	void marry()
	{
		System.out.println("Aishwarya");
	}
}
class RTP
{
	public static void main(String[] args) 
	{
		P ob1=new P();
		ob1.marry();
		C ob2=new C();
		ob2.marry();
		P ob3=new C();
		ob3.marry();
	}
}
