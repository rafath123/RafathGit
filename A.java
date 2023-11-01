class Marker
{
	String name;
	String color;
	double price;


	Marker(){}
	Marker(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public String toString()
	{
		System.out.println("name of the marker is : "+name);
		System.out.println("color of the marker is: "+color);
		System.out.println("prce of the marker is: "+price);
        return "";
	}
}
class A
{
	public static void main(String[] args) 
	{
		Marker a1=new Marker("Rorito","Blue",20);
		System.out.println(a1);
        Marker a2=new Marker("Renalts","Red",25);
		System.out.println(a2);
		Marker a3=new Marker("Mystick","Black",30);
		System.out.println(a3);
		System.out.println("Hello World!");
	}
}
