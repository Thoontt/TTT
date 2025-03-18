
public class CarMain { public static void main(String[] args) {
	// TODO Auto-generated method }
	
	
	class Car {
		
		int speed;
		double regularPrice;
		String color;
		
		 public Car(int speed, double regularPrice, String color) {
			    this.speed = speed;
			    this.regularPrice = regularPrice;
			    this.color = color;
		 }
		 
		 public double getSalePrice() {
			    return regularPrice;
			}
			}

	    //TRUCK

	    class Truck extends Car {
	    int weight;
	    
	    
	    public Truck(int speed, double regularPrice, String color, int weight) {
	        super(speed, regularPrice, color); 
	        this.weight = weight;
	    }
	    
	    public double getSalePrice() {
	        if (weight > 2000) {
	            return regularPrice * 0.9; 
	        } else {
	            return regularPrice * 0.8; 
	        }
	    }
	}
	    
	    //FORD
	    class Ford extends Car {
	        int year;
	        int manufacturerDiscount;

	        public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
	            super(speed, regularPrice, color); 
	            this.year = year;
	            this.manufacturerDiscount = manufacturerDiscount;
	        }

	        public double getSalePrice() {
	            double salePrice = super.getSalePrice(); 
	            return salePrice - manufacturerDiscount; 
	        }
	    }
	    
	    //SEDEN
	    class Sedan extends Car {
	        int length;

	        public Sedan(int speed, double regularPrice, String color, int length) {
	            super(speed, regularPrice, color); 
	            this.length = length;
	        }

	        public double getSalePrice() {
	            double salePrice = super.getSalePrice(); 
	            if (length > 20) {
	                return salePrice * 0.95; 
	            } else {
	                return salePrice * 0.90; 
	            }
	        }
	    }
	    
	    
	   

		

	}
}

