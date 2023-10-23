import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ImageFrame {
        BufferedImage image = null;
        JFrame form = null;
        public ImageFrame(byte[] imageInByte)
                throws IOException
        {
            image = ImageIO.read(new
                    ByteArrayInputStream(imageInByte));
            form = new JFrame();
            form.setSize(image.getWidth(),
                    image.getHeight());
            form.setAlwaysOnTop(true);

            JPanel pn = new JPanel(){
                @Override
                public void paint(Graphics g) {
                    super.paint(g);
                    g.drawImage(image, 0, 0, image.
                            getWidth(), image.getHeight(), null);
                }};
            pn.setSize(image.getWidth(),
                    image.getHeight());
            form.add(pn);
            form.setVisible(true);
        }
}
