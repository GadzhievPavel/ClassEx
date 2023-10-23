import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex3 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(new File("test.txt"));
            File file = new File("outputFile3.txt");
            out = new FileOutputStream(file);
            int c;
            while ((c = in.read()) != -1) {
                if(c < 65)out.write(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex3.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Ex3.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex3.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
