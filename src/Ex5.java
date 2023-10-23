import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex5 {
    public static void main(String[] args) {
        FileOutputStream fout=null;
        ObjectOutputStream oout=null;
        try {
            fout = new FileOutputStream("fish.txt");
            Fish f = new Fish("salmon",2.5,180);
            oout = new ObjectOutputStream(fout);
            oout.writeObject(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex5.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ex5.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                oout.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex5.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
