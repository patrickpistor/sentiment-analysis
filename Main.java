import java.net.*;
import java.util.ArrayList;
import java.io.*;
 

public class Main {
	@SuppressWarnings("resource")
	public static void main (String[] args) throws java.lang.Exception {
		//Set up the files to save the data to
		String word = "word.txt";
		String type = "type.txt";
		String comp = "comp.txt";
		String conn = "conn.txt";
		
		//Add the first word
        try {
            FileWriter fileWriter = new FileWriter(word);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("hate");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + word + "'");
        }
        
        try {
            FileWriter fileWriter = new FileWriter(type);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("noun");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + type + "'");
        }
        
        try {
            FileWriter fileWriter = new FileWriter(comp);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("first");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + comp + "'");
        }
        
        try {
            FileWriter fileWriter = new FileWriter(conn);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("false");
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + conn + "'");
        }
        
        
        
//        String line = null;
//        try {
//            FileReader fileReader = new FileReader(word);
//
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }   
//
//            // Always close files.
//            bufferedReader.close();         
//        }
//        catch(FileNotFoundException ex) {
//            System.out.println(
//                "Unable to open file '" + 
//                		word + "'");                
//        }
//        catch(IOException ex) {
//            System.out.println(
//                "Error reading file '" 
//                + word + "'");                  
//        }
		String currentWord = "hate";
		String currentType = "noun";
		String currentConn = "first";
		boolean currentComp = false;
		
		URL url = new URL("http://words.bighugelabs.com/api/2/"YOUR API KEY HERE"/hate/");
		BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));
		
		for(int i = 0; i < 100; i++) {
			String inputLine;
	        ArrayList<String> output = new ArrayList<String>();
	        while ((inputLine = in.readLine()) != null) {
	        	output.add(inputLine);
	        }
	        for(int j = 0; j < output.size(); j++) {
	        	currentType = output.set(j, output.get(j).substring(0, output.get(j).indexOf("|")));
	        	currentConn = output.set(j, output.get(j).substring(0, output.get(j).indexOf("|")));
	        	currentWord = output.set(j, output.get(j).substring(0, output.get(j).indexOf("|")));
	        	currentComp = false;
	        	
	        }
		}
//    URL url = new URL("http://words.bighugelabs.com/api/2/"YOUR API KEY HERE"/hate/");
//		BufferedReader in = new BufferedReader(
//        new InputStreamReader(url.openStream()));
// 
//        String inputLine;
//        int results = 0;
//        while ((inputLine = in.readLine()) != null) {
//        	results++;
//            System.out.println(inputLine);
//        }
//        in.close();
}
