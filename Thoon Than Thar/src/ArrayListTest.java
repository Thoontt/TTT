import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	private static final char[] List = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add('c');
		list.add(true);
		list.add(2.3);
		list.add("java");
		
		System.out.println(list);
		list.add(new Employee());
		System.out.println(list);
		System.out.println(list.get(1));
		
		double number=(double)list.get(3);
		
		
		}
		}
		

