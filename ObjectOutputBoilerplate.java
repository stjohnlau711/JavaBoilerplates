import java.io.*;

public class ObjectOutputBoilerplate {

	public static final String StorageDIR = "EXAMPLEDIRECTORY"; //edit

	public static void storeObj(Object b) throws FileNotFoundException, IOException {
		String fileName = "examplefilename";
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(StorageDIR + fileName));
		output.writeObject(o);
		output.close();
	}
	
	public static Object retrieveObj() throws FileNotFoundException, IOException, ClassNotFoundException {
		String fileName = "examplefilename";
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(StorageDIR + fileName));
		Object o = (Object) input.readObject();
		input.close();
		return o;
		
	}
}