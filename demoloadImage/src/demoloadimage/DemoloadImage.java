package demoloadimage;

import javax.swing.JFrame;


public class DemoloadImage extends JFrame{

    
    public static void main(String[] args) {
        JFrame MainGrap = new JFrame("Happy Women Day"); 
        int t = 0; 
//        ImagePanel[] IM;
//        IM = new ImagePanel[3]; 
//        for (int i = 0; i < 3; i++){
//            IM[i] = new ImagePanel(); 
//            IM[i].ImagePanel(t, 0);
//            t = t + 100; 
//            MainGrap.add(IM[i]); 
//        }

        ImagePanel IM0 = new ImagePanel(); 
        IM0.ImagePanel(0, 0);
        MainGrap.add(IM0); 
        
        ImagePanel IM1 = new ImagePanel(); 
        IM0.ImagePanel(100, 0);
        MainGrap.add(IM1); 
        
        MainGrap.setSize(1000, 500);
        
        MainGrap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MainGrap.setVisible(true);
    }
    
}
