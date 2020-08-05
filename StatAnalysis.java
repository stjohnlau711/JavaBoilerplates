package lau.ANALYSIS;

import java.io.*;

public class StatAnalysis { 

	public static final String DIR = "/Users/stjohnlau/eclipse-workspace/LauHW5/src/";
	
	public static int countValues(String fp) throws IOException{
		
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
	
	public static double sumValues(String fp) throws IOException{
		
		double sum = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				sum += Double.parseDouble(list[i]);
			}
		}
		reader.close();
		return sum;
		
	}
	
	public static double muValue(String fp) throws IOException{
		
		double sum = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				sum += Double.parseDouble(list[i]);
			}
		}
		reader.close();
		double avg = sum / countValues(fp);
		return avg;
		
	}
	
	public static double sigma(String fp) throws IOException{
		
		double sumOfSquaredDifferences = 0;
		double avg = muValue(fp);
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				sumOfSquaredDifferences += Math.pow((Double.parseDouble(list[i]) - avg),2);
			}
		}
		reader.close();
		double variance = sumOfSquaredDifferences / countValues(fp);
		double sigma = Math.sqrt(variance);
		return sigma;
	}
	
	public static double sigma2(String fp) throws IOException {
		
		double sumOfSquaredDifferences = 0;
		double avg = muValue(fp);
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				sumOfSquaredDifferences += Math.pow((Double.parseDouble(list[i]) - avg),2);
			}
		}
		reader.close();
		double variance = sumOfSquaredDifferences / countValues(fp);
		return variance;
	}
	
	public static double maxValue(String fp) throws IOException {
		
		double max = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				double tempMax = Double.parseDouble(list[0]);
				if(Double.parseDouble(list[i]) > max) {
					tempMax = Double.parseDouble(list[i]);
				}
				max = tempMax;
			}
		}
		reader.close();
		return max;
		
	}
	
	public static double minValue(String fp) throws IOException{

		double min = 0;
		
		FileReader freader = new FileReader(fp);
		BufferedReader reader = new BufferedReader(freader);
		
		String data;
		
		while((data = reader.readLine()) != null) {
			String[] list = data.split("\\s+");
			for(int i = 0; i < list.length; i ++) {
				double tempMin = Double.parseDouble(list[0]);
				if(Double.parseDouble(list[i]) < min) {
					tempMin = Double.parseDouble(list[i]);
				}
				min = tempMin;
			}
		}
		reader.close();
		return min;
	}
	
	public static double rangeValues(String fp) throws IOException {
		
		double max = maxValue(fp);
		double min = minValue(fp);
		
		double range = max - min;
		
		return range;
	}
	
	
	
	
	
	
	
	
	
	
}
