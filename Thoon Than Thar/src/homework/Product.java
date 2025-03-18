package homework;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.ToString;
@ToString
@Getter

class PB{
     String pdCode;
     String PdName;
     double pdPrice;
PB(String pdCode, String pdName, double pdPrice){
    this.pdCode=pdCode;
    this.PdName=pdName;
    this.pdPrice=pdPrice;
  }
}//PB class end

public class Product {
  public static void main (String[]args) {
    // object create
    PB product1 = new PB("P100", "Laptop", 1500.0);
      PB product2 = new PB("P101", "Smartphone", 800.0);
      PB product3 = new PB("P102", "Tablet", 600.0);
      PB product4 = new PB("P103", "Moouse", 300.0);
      PB product5 = new PB("P104", "Keyboard", 50.0);
        
     Map<String,PB> map=new HashMap<>();// String means pdcode and Pb means productt object
     map.put(product1.getPdCode(), product1); 
        map.put(product2.getPdCode(), product2);
        map.put(product3.getPdCode(), product3);
        map.put(product4.getPdCode(), product4);
        map.put(product5.getPdCode(), product5);
        
        
        String valueToCheckString = "P109";
        if (map.containsKey(valueToCheckString)) {
            System.out.println("Product with code " + valueToCheckString + " exists: " + map.get(valueToCheckString));
        } else {
            System.out.println("Product with code " + valueToCheckString + " does not exist.");
        }

  }//void end
}//class end
