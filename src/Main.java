import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        File fnew=new File("2.jpg");
        byte[] imageInByte = null;
        try{
            BufferedImage bImage= ImageIO.read(fnew);
            ByteArrayOutputStream baos = new
                    ByteArrayOutputStream();
            ImageIO.write(bImage, "jpg", baos );
            imageInByte=baos.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

        ImageFrame imageFrame = new ImageFrame(imageInByte);
//        String fileName = "text.txt";
//        String fullName = "";
//        String dirName = System.getProperty("user.dir");
//        fullName = dirName + File.separator + fileName;
//        System.out.println("File path : " + fullName);
//        File file = new File(fullName);
//
//        if ( ! file.exists()){
//            try {
//                if( file.createNewFile() ) {
//                    System.out.println("File created!");
//                    throw new IOException();
//                }
//                else {
//                    System.out.println("Something Wrong!");
//
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(Main.class.getName()).
//                        log(Level.SEVERE, null, ex);
//                System.out.println("qq");
//            }
//        }else{
//            System.out.println("File already exists!");
//        }
//
//        dirName = "tmp";
//        File dir = new File(dirName);
//        dir.mkdir();

    }
}
