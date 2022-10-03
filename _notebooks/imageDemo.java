import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class imageDemo {
    public static void main( String[] args ){
        BufferedImage img = null;  // buffer type 
         try {
            String name = "pepsi-logo";
            String in = "images/";
            String out = "images/tmp/";

            // Either use URL or File for reading image using ImageIO
            File imageFile = new File(in + name + ".png");
            img = ImageIO.read(imageFile);  // set buffer of image data

            // ImageIO Image write to gif in Java
            // Documentation https://docs.oracle.com/javase/tutorial/2d/images/index.html
            ImageIO.write(img, "gif", new File(out + name + ".gif") );  // write buffer to gif

        } catch (IOException e) {
              e.printStackTrace();
        }
        System.out.println("Success");
    }
}

