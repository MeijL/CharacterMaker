import java.io.*;

public class CharFile {
	
    public CharFile() {
    	
    }
    public String readFile(String name){
        // name of file
        String fileName = name;

        String fileCode = "";
        
        // reference one line at a time
        String line = null;

        try {
            // FileReader reads text file
            FileReader fileReader = 
                new FileReader(fileName);

            // wrap FileReader in BufferedReader
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                fileCode += line;
            }   
            // close file
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to find character [" + 
                fileName + "]");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading [" 
                + fileName + "]");                  
        }
        return fileCode;
    }
    public void writeFile(Character c){
    	// name of file
        String fileName = c.getName()+".txt";

        try {
            // default encoding
            FileWriter fileWriter =
                new FileWriter(fileName);

            // wrap FileWriter in BufferedWriter
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // write to file
            bufferedWriter.write("placeholder text");
            bufferedWriter.newLine();

            // close file
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error saving ["
                + fileName + "]");
        }
    }
}
