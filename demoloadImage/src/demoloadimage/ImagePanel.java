package demoloadimage;

import javax.swing.*;

import java.awt.event.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements ActionListener
{
    Timer t = new Timer (10, this);
    private static double sizeLength = 1366, sizeWidth = 768;
    private BufferedImage image;
    private BufferedImage image2;
    private BufferedImage image3;
    
    private BufferedImage imagePlatClass;
    private BufferedImage imagePlatGirl;
    private BufferedImage imagePlatUncel;
    private BufferedImage imagePlatMother;
    
    // xử lý chéo1. 
    private double local_X, velX = 2;
    
    private double local_Y, velY = 2;
    // xử lý chéo 2. 
    private double local_YC1 = 300, velYC1 = 2;
    // chéo 3. 
    private double local_YC2 = 500, velYC2 = 2;
    
    private double local_XC1 = sizeLength - 64, velXC1 = 2;
    
    // xử  lý ngang. 
    private double local_X1 = 0, velX1 = 2;  
    // xử lý ngang 2. 
    private double local_X1N = sizeLength - 64, velX1N = 2; 
    // xử lí dọc.  
    private double local_Y2 = 0, vel_Y2 = 2; 
    // in doc 2. 
    private double local_Y2D = sizeWidth - 90, vel_Y2D = 2; 
    
    void ImagePanel (double local_X, double local_Y){
        this.local_X = local_X; 
        this.local_Y = local_Y; 
        new ImagePanel(); 
    }
   
    public ImagePanel() {
       try {                
          image = ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\rose 64.png"));
          image2 = ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\rosechinhthuc.png"));
          image3 = ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\bouquetchinhthuc.png"));
          
          imagePlatClass = ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\ImagePlatform.png"));
          imagePlatGirl = ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\imageTVuong.png"));
          imagePlatUncel =  ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\imageUncel.png"));
          imagePlatMother = ImageIO.read(new File("D:\\bai_tap_java\\baiTapTuan6\\imageMother.png"));
                  
       } catch (IOException ex) {
            // handle exception...
            System.out.println("Không load được Image");
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // xử lí chéo 1; 
        g.drawImage(image2, (int)local_X, (int)local_Y, this);
        g.drawImage(image2, (int)local_X, (int)local_YC1, this);
        g.drawImage(image2, (int)local_X, (int)local_YC2, this);
        
        g.drawImage(image2, (int)local_XC1, (int)local_Y, this);
        g.drawImage(image2, (int)local_XC1, (int)local_YC1, this);
        g.drawImage(image2, (int)local_XC1, (int)local_YC2, this);
       
//        // in ngang. 
        g.drawImage(image3, (int)local_X1, 0, this);
        
        g.drawImage(image3, (int)local_X1N, 128, this);
        
        g.drawImage(image3, (int)local_X1, 256, this); 
        
        g.drawImage(image3, (int)local_X1N, 384, this);
        
        g.drawImage(image3, (int)local_X1, 512, this); 
        
        g.drawImage(image3, (int)local_X1N, 640, this);
       
        // in doc. 
        g.drawImage(image, 0, (int)local_Y2, this); 
        
        g.drawImage(image, 200, (int)local_Y2D, this);
        
        g.drawImage(image, 400, (int)local_Y2, this); 
        
        g.drawImage(image, 600, (int)local_Y2D, this);
        
        g.drawImage(image, 800, (int)local_Y2, this); 
        
        g.drawImage(image, 1000, (int)local_Y2D, this);
        
        g.drawImage(image, 1200, (int)local_Y2, this); 
        
        // in platform
        g.drawImage(imagePlatClass, 683 - 100, 384 - 159, this); 
        t.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Xử lý chéo. 
        if (local_X < 0 || local_X > sizeLength - 64){
            velX = - velX; 
        }
        if (local_Y < 0 || local_Y > sizeWidth - 90){
            velY = - velY;
        }
        
        if (local_YC1 < 0 || local_YC1 > sizeWidth - 90){
            velYC1 = - velYC1; 
        }
        
        if (local_YC2 < 0 || local_YC2 > sizeWidth - 90){
            velYC2 = - velYC2; 
        }
        
        if (local_XC1 < 0 || local_XC1 > sizeLength - 64){
            velXC1 = - velXC1; 
        }
        
        // Xử lý ngang. 
        if (local_X1 < 0 || local_X1 > sizeLength - 64){
            velX1 = -velX1; 
        }
        
        if (local_X1N < 0 || local_X1N > sizeLength - 64){
            velX1N = -velX1N; 
        }
        
        // Xử lý dọc. 
        if (local_Y2 < 0 || local_Y2 > sizeWidth - 90){
            vel_Y2 = -vel_Y2; 
        }
        
        if (local_Y2D < 0 || local_Y2D > sizeWidth - 90){
            vel_Y2D = -vel_Y2D; 
        }
        
        // xử lí chéo. 
        local_X+= velX; 
        local_Y+= velY;
        local_YC1+= velYC1;
        local_YC2+= velYC2;
        
        local_XC1-= velXC1;
        
        // xử lí ngang. 
        local_X1+= velX1; 
        local_X1N-= velX1N; 
        // xử lí dọc. 
        local_Y2+= vel_Y2; 
        local_Y2D-= vel_Y2D; 
        repaint(); 
    }
    
    public static void main(String[] args){
        JFrame MainGrap = new JFrame("bai tap tuan 6"); 
          
        ImagePanel cr2 = new ImagePanel();
        
        cr2.ImagePanel(0, 0);
         
        MainGrap.add(cr2); 
        
        MainGrap.setSize((int)sizeLength, (int)sizeWidth);
        
        MainGrap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainGrap.setVisible(true);
    }

}
