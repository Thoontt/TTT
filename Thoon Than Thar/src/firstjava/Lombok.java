package firstjava;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Lombok {
	 private int id;
	  private  String name;
	  
	  public static void main(String[]args) {
	    Lombok lb =new Lombok();
	    
	    lb.setId(2);
	    lb.setName("mgmg");
	    
	    System.out.println(lb.getId());
	    System.out.println(lb);
	    
	  }

	  @Override
	  public String toString() {
	    return "Lombok [id=" + id + ", name=" + name + "]";
	  }
	  
	 
}
