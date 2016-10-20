import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Circle {

	JButton smaller;
	JButton bigger;
	JFrame frame;
	Draw draw;
	
	public void Circle() // Sets the default stuff for any circle
	{
		smaller = new JButton("Smaller");
		bigger = new JButton("Bigger");
		
		frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		draw = new Draw(frame.getSize().width, frame.getSize().height);
		
		bigger.addActionListener(new BiggerButton());
		smaller.addActionListener(new SmallerButton());
	}
	
	public void run() // Sets Where You Want The Components In The Frame
	{
		Circle();
		
		frame.add(BorderLayout.SOUTH, smaller);
		frame.add(BorderLayout.NORTH, bigger);
		frame.add(BorderLayout.CENTER, draw);
		
		frame.setVisible(true);
	}
	
	public class BiggerButton implements ActionListener{ // Makes Circle Bigger by Button
		
		public void actionPerformed(ActionEvent event){
			draw.enBiggen();
		}
	}
	
	public class SmallerButton implements ActionListener{ // Makes Circle Smaller by Button
		
		public void actionPerformed(ActionEvent event){
			draw.enSmallen();
		}
	}

}
