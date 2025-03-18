
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.ToString;
@ToString
@Getter

class PB {
	
	     String pdCode;
	     String PdName;
	     double pdPrice;
	PB(String pdCode, String pdName, double pdPrice){
	    this.pdCode=pdCode;
	    this.PdName=pdName;
	    this.pdPrice=pdPrice;
	  }
	}


