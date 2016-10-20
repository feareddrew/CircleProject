import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Circle {

	JButton smaller;
	JButton bigger;
	JFrame frame;
	Draw draw;
	
	public void run() 
	{
		frame = new JFrame();
		
		frame.setSize(600,600);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		smaller = new JButton("Smaller");
		bigger = new JButton("Bigger");
		
		//draw = new Draw();
		draw = new Draw(frame.getSize().width, frame.getSize().height);
		
		smaller.addActionListener(new SmallerButton());
		bigger.addActionListener(new BiggerButton());
		
		frame.add(BorderLayout.SOUTH, smaller);
		frame.add(BorderLayout.NORTH, bigger);
		frame.add(BorderLayout.CENTER, draw);
		
		frame.setVisible(true);
	}
	
	public class BiggerButton implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			draw.enBiggen();
		}
	}
	
	public class SmallerButton implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			draw.enSmallen();
		}
	}

}
