import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex6 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(new File("fish.txt"));
            ObjectInputStream oin = new ObjectInputStream(fin);
            Fish f = (Fish) oin.readObject();
            System.out.println(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex6.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ex6.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ex6.class.getName()).
                    log(Level.SEVERE, null, ex);
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex6.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
