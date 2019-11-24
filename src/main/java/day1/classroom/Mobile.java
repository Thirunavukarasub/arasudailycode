package day1.classroom;

public class Mobile {

	public int makecall() 
	{
		System.out.println("Number");
		return 123456;
	}
	public String Text()
	{
		System.out.println("text");
		return" i will call";

	}
	public String shutdown(){
	System.out.println("shutup");
	return "shutup";
}
public static void main(String[] args) {
	Mobile dem= new Mobile();
	
	int makecall = dem.makecall();
	System.out.println(makecall);
	String text = dem.Text();
	System.out.println(text);
	String shutdown = dem.shutdown();
	System.out.println(shutdown);
}
}

