import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Frame extends JFrame {
	JPanel  jp;
	JLabel lab;
	public Frame(){
		
	//	JFrame f= new JFrame();
		
		setTitle("JAVA");
		setSize(400, 400);
		  jp = new JPanel();
		 lab = new JLabel(new ImageIcon("button-green.png"));
		jp.add(lab);
		setContentPane(jp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		setBackground(Color.black);
		setVisible(true);
	}

	
}
