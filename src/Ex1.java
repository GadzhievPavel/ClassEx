import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1 {
    public static void main(String[] args) {
        InputStream in=null;
        OutputStream out=null;
        byte[] buffer=null;
        try {
            in = new FileInputStream(new File("text.txt"));
            buffer = new byte[in.available()];
            in.read(buffer);
            File file = new File("outputFile.tmp");
            out = new FileOutputStream(file);
            out.write(buffer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex1.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ex1.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex1.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
