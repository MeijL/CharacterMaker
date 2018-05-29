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
    public void writeFile(String charCode){
    	// name of file
        String fileName = charCode.substring(0,charCode.indexOf(">"))+".txt";

        try {
            FileWriter fileWriter =
                new FileWriter(fileName);

            // wrap FileWriter in BufferedWriter
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // write to file
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);
            bufferedWriter.newLine();
            bufferedWriter.write(charCode.substring(0, charCode.indexOf("<")+1));
            charCode = charCode.substring(charCode.indexOf("<")+1);

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
