import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class Ex4 {
    public static void main(String[] args) {


        String line = "This is a sample string to be capitalized";
        ByteArrayInputStream bais =
                new ByteArrayInputStream(line.getBytes());
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = bais.read()) != -1) {
            sb.append(Character.toUpperCase((char) ch));
        }
        System.out.println("Capitalized string: " +
                sb.toString());
    }
}
