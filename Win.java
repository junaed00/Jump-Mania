package win;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
//import java.awt.Dimension;
import javax.swing.*;
// import javax.awt.Font;
public class Win {
    public static void main(String[] args) {
        //new winboard();
        new entry();
        
    }    
}

class entry extends JFrame{
    JLabel welcome;
    JRadioButton p2,p3,p4,p5;
    
    public entry(){
        super("Jump Niggas");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(330,680);
        //setBounds(700,30,300,600);
        setLocationRelativeTo(null);
        setBackground(Color.GRAY);
        welcome= new JLabel("Welcome to\nJUMP NIGGAS");
        welcome.setBounds(10,10,200,100);
        add(welcome);
        
        p2= new JRadioButton("2 Players");
        p3= new JRadioButton("3 Players");
        p4= new JRadioButton("4 Players");
        p5= new JRadioButton("5 Players");
        
        add(p2); add(p3);add(p4);add(p5);
        
        p2.setBounds(100,100,400,50);
        p3.setBounds(100,200,400,50);
        p4.setBounds(100,300,400,50);
        p5.setBounds(100,400,400,50);
        
        p2.setSelected(true);
 
    }
    
}

class winboard extends JFrame{
    
    JLabel boardlbl;
    ImageIcon board, maindice;
    JButton dice, reroll;
    public winboard(){
        super("Jump Niggas");
        
        this.setSize(410,670);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setBounds(700,30,300,600);
        setLocationRelativeTo(null);
        setResizable(false);
        
//        boardlbl = new JLabel(board);
//        boardlbl.setBounds(0,0,330,600);
//        boardlbl.setIcon(resize(new ImageIcon("Board.png"),boardlbl.getWidth(),boardlbl.getHeight() ));
//        add(boardlbl);
//        setVisible(true);

//        board= new ImageIcon("");
        
        board= new ImageIcon("BBBBB.png");
        boardlbl = new JLabel(board);
        boardlbl.setLayout(null);
        boardlbl.setBounds(0,2,350,655);
        add(boardlbl);
            
        dice = new JButton("Roll");
        dice.setBounds(352,520,40,40);
        reroll = new JButton("re");
        reroll.setBounds(360,470,25,35);
        
        add(dice);
        add(reroll);
        
        
    
        //pack();
    }
//    public static ImageIcon resize(ImageIcon im, int w,int h){
//
// 
//        BufferedImage bi = new BufferedImage(w,h,BufferedImage.TRANSLUCENT);
// 
//        Graphics2D g2d = (Graphics2D)bi.createGraphics();
//        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
//        
//        g2d.drawImage(im.getImage(), 0, 0,w,h,, null);
//        g2d.dispose();
//        return new ImageIcon(bi);
//    }
    
        

}


 
