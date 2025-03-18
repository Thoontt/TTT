import java.io.*;
public class FileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File ("/Users/thoonthanthar/Desktop/TTT/TTT.txt");
			file.createNewFile();
			System.out.println(file);
			
			FileReader fr=new FileReader("/Users/thoonthanthar/Desktop/TTT/TTT.txt"); BufferedReader br=new BufferedReader(fr);
			int i;
			while((i=br.read())!=-1){ System.out.print((char)i); }
			br.close();
			fr.close();
			InputStreamReader r=new InputStreamReader(System.in); BufferedReader br1=new BufferedReader(r); System.out.println("Enter your name");
			String name=br1.readLine();
			System.out.println("Welcome "+name);
			FileWriter writer = new FileWriter("/Users/thoonthanthar/Desktop/TTT/TTT.txt");
			BufferedWriter buffer = new BufferedWriter(writer); 
			buffer.write(name);
			buffer.close();
			System.out.println("Success");
			} catch (IOException e) { e.printStackTrace();
	}

}
}