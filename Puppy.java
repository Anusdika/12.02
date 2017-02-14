public class Puppy
{
	public Puppy(String name)
	{
		System.out.println("Passed name is: "+name);
	}
	public Puppy(String name1, String name2)
	{
		System.out.println("Passed names are: "+name1);
		System.out.println("Passed names are: "+name2);
	}
	
	public static void main(String [] args)
	{
		Puppy P1=new Puppy("tommy");
		Puppy P2=new Puppy("Jonny","Benji");
	}
}