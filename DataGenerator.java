package lau.FILECREATION;

import java.io.*;
import lau.MAIN.Analytically;

public class DataGenerator {

	public static final String DIR = "/Users/stjohnlau/eclipse-workspace/LauHW5/src/";
	
	public static void buildIntegerFile(String fp, int count) throws IOException {
		
		int[] integers = new int[count];
		
		for(int i = 0; i < count; i ++) {
			int item = (int)(Math.random() * (101));
			integers[i] = item;
		}
		
		File F = new File(fp);
		
		F.createNewFile();
		
		PrintWriter pw = new PrintWriter(F);
		
		for(int i = 0; i < count; i++) {
			pw.write(String.valueOf(integers[i]) + " ");
			if((i - 9) % 10 == 0 && i != 0){
				pw.println();
			}
		}
		pw.close();	
		
	}
	
	public static void buildDecimalFile(String fp, int count) throws IOException {
		
		double[] decimals = new double[count];
		
		for(int i = 0; i < count; i ++) {
			double item = (Math.random() * (101));
			decimals[i] = item;
		}
		
		File F = new File(fp);
		
		F.createNewFile();
		
		PrintWriter pw = new PrintWriter(F);
		
		
		for(int i = 0; i < count; i++) {
			pw.write(String.format("%.2f", decimals[i]) + " ");
			if((i - 9) % 10 == 0 && i != 0){
				pw.println();
			}
		}
		pw.close();	
	}
	
	public static void buildCharacterFile(String fp, int count) throws IOException{
		
		char[] characters = new char[count];
		
		for(int i = 0; i < count; i ++) {
			int item = (int)(Math.random() * (52));
			characters[i] = Analytically.ALPHABET[item];
		}
		
		File F = new File(fp);
		
		F.createNewFile();
		
		PrintWriter pw = new PrintWriter(F);
		
		for(int i = 0; i < count; i++) {
			pw.write(characters[i] + " ");
			if((i - 9) % 10 == 0 && i != 0){
				pw.println();
			}
		}
		pw.close();	
		
	}
	
	public static void buildAlphaNumericFile(String fp, int count) throws IOException{
		
		char[] characters = new char[count];
		
		int[] numericValues = new int[count];
		
		for(int i = 0; i < count; i ++) {
			int item = (int)(Math.random() * (52));
			characters[i] = Analytically.ALPHABET[item];
		}
		
		for(int i = 0; i < count; i ++) {
			int item = (int)(Math.random() * (9));
			numericValues[i] = Analytically.DIGIT[item];
		}
		
		File F = new File(fp);
		
		F.createNewFile();
		
		PrintWriter pw = new PrintWriter(F);
		
		for(int i = 0; i < count; i++) {
			pw.write(characters[i] + String.valueOf(numericValues[i]) + " ");
			if((i - 9) % 10 == 0 && i != 0){
				pw.println();
			}
		}
		pw.close();	
	}
}
