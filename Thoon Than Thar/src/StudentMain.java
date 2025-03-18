import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        List<Student1> List = new ArrayList<>();
        List.add(new Student1("S01", "Thura", 18));
        List.add(new Student1("S02", "Kay Kay", 19));
        List.add(new Student1("S03", "Chaw Chaw Oo", 22));
        List.add(new Student1("S04", "Yan Kyaw Htet", 17));
        List.add(new Student1("S05", "Yar Zar Aung", 20));

       
        System.out.println("Students under 20 from ArrayList:");
        for (Student1 s : List) {
            if (s.getAge() < 20) {
                System.out.println(s);
            }
        }
 
        System.out.println("---------------------------");

        
        List<Student1> linkedList = new LinkedList<>();
        linkedList.add(new Student1("S06", "Nay Zar Linn", 21));
        linkedList.add(new Student1("S07", "Tay Zar Linn", 23));
        linkedList.add(new Student1("S08", "Nann Mya Thida", 19));
        linkedList.add(new Student1("S09", "Khunn Khant ", 25));
        linkedList.add(new Student1("S10", "Pyae Sone aung",26));

        
        System.out.println("Students over 20 from LinkedList:");
        for (Student1 s : linkedList) {
            if (s.getAge() > 20) {
                System.out.println(s);
            }
        }
    }
}

