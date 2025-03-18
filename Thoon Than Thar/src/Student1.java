
import lombok.Getter;
//import lombok.Setter;
import lombok.ToString;
import java.util.*;

@Getter
//@Setter
@ToString
class Student1{
    private String id;
    private String name;
    private int age;

    
    public Student1(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

