

public class MyOwnAutoShop1 {
	 
	     public static void main(String[] args) {
	       
	    	Car myCar = new Car(120, 20000, "White");
	    	Truck myTruck = new Truck(120, 40000, "Gray", 2500);
	        Ford myFord = new Ford(150, 30000, "Blue", 2022, 2000);
	        Sedan mySedan = new Sedan(180, 25000, "Black", 22);
	        
	        System.out.println("Sale Price of Car: $" + myCar.getSalePrice());
	        System.out.println("Sale Price of Truck: $" + myTruck.getSalePrice());
	        System.out.println("Sale Price of Ford: $" + myFord.getSalePrice());
	        System.out.println("Sale Price of Sedan: $" + mySedan.getSalePrice());

	    }
	}

	

	


