
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read{

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
            
            System.out.println(sb);
        }
    }
}