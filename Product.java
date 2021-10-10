class Product
{
String name;
String type;
float price;
int quantity;
String vendor;
static float totalProductsPrice;
// no of parameters
// order/sequcnce 
// change in datatype 
Product(String name,String type,float price,int quantity,String vendor)
{
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	this.vendor=vendor;
	this.type=type;
	System.out.println("invoked 5 parameters const");
}
 
 Product(String name,float price,int quantity)
 {
	 this.name=name;
	 this.price=price;
	 this.quantity=quantity;
	 System.out.println("invoked 3 parameters const");
 }
 
void displayDetails()
{
System.out.println("displaymethod is invoked");
System.out.println(this.name);
System.out.println(this.type);
System.out.println(this.price);
System.out.println(this.quantity);
System.out.println(this.vendor);
}


void printTotalCost()
{
	float total=this.price*this.quantity;
	System.out.println("TOTAL COST :"+total);
	totalProductsPrice=totalProductsPrice+total;
System.out.println("Total Products Price :"+totalProductsPrice);

}

static void printTotalProductsPrice()
{
	System.out.println("Total Products Price :"+totalProductsPrice);
}

}