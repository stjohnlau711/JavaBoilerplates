import java.io.*;

public class SymbolAnalysis {

	public static final String DIR = "EXAMPLEDIRECTORY"; //edit
	
	public static int characterCount(String fp) throws IOException{
		
		int count = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			count += list.length;
		}
		reader.close();
		return count;
	}
	
	public static int countSpecifiedCharacter(String fp, char c) throws IOException{
		
		int count = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				int tempCount = 0;
				if (list[i] == Character.toString(c)) {
					tempCount += 1;
				}
				count = tempCount;
			}
		}
		reader.close();
		return count;
	}
	
	public static int wordCount(String fp) throws IOException{
		
		int count = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			count += list.length;
		}
		reader.close();
		return count;	
	}
	
	public static int countSpecifiedWords(String fp, String word) throws IOException {
		
		int count = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				int tempCount = 0;
				if (list[i] == word) {
					tempCount += 1;
				}
				count = tempCount;
			}
		}
		reader.close();
		return count;	
	}
}
