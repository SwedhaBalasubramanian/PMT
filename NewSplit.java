import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.io.IOException;
import java.io.IOException;
//import java.io.File;
public class NewSplit{

    public static void main(String[] args) throws IOException {
        
        String fileName = "/home/swedha/workspace/New/src/kk.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);

                if (line != null) {
                    sb.append(System.lineSeparator());
                }
            }
           
            String filename ="/home/swedha/workspace/New/src/t.txt";
            //FileWriter fw = new FileWriter(f,true);    // true is for append
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            
                       
            System.out.println(sb.toString());
            String paragraph = sb.toString();
           // System.out.println(paragraph);
            String[] answer = paragraph.split("\\.");
            int Index = 1;
            for (String result : answer) {
            	if(result.matches(".*\\w.*")){
               System.out.println(Index+"-"+result);
               //bw.println(Index+"-"+result);
               bw.append(Index+"-"+result);
               bw.newLine();
               //bw.write(Index+"-"+result);
               Index++;
            }
             
        }
                       
            bw.close();
    }
    }
    
}
	
	     
	      
	      
	
	


