import java.io.IOException;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //String path = scanner.next();
        String path = "myFile.txt";
        FileHandler fileHandler = new FileHandler(path);
        while (!fileHandler.isEnd()) {
            System.out.println(fileHandler.getText());
            System.out.println("нажми чтобы увидеть еще");
            scanner.next();
        }
//        try {
//            System.out.println(FileHandler.getText(path));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
