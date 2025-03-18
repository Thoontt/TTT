import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee{
	private int id;
	private String name;
	
	public static void main(String[]args) {
		Employee emp = new Employee();
		emp.setId(2);
		System.out.print(emp.getId());
	}
}