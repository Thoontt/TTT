package java;

class Product {

	
		
		    private String pdCode;
		    private String pdName;
		    private double pdPrice;

		    public Product(String pdCode, String pdName, double pdPrice) {
		        this.pdCode = pdCode;
		        this.pdName = pdName;
		        this.pdPrice = pdPrice;
		    }

		    public String getPdCode() {
		        return pdCode;
		    }

		    public String getPdName() {
		        return pdName;
		    }

		    public double getPdPrice() {
		        return pdPrice;
		    }

		    @Override
		    public String toString() {
		        return "Product Code: " + pdCode + ", Name: " + pdName + ", Price: " + pdPrice;
		    }
		

	}


