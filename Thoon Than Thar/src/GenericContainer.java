
public class GenericContainer<T> {
	private T object;

    
    public GenericContainer(T object) {
        this.object = object;
    }

    
    public T getObject() {
        return object;
    }

    
    @Override
    public String toString() {
        return object != null ? object.toString() : "null";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GenericContainer<String> stringContainer = new GenericContainer<>("Hello, World!");
	        System.out.println(stringContainer);

	        GenericContainer<Integer> integerContainer = new GenericContainer<>(123);
	        System.out.println(integerContainer);
	        
	    }
	    }
	

	

