import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * This class builds a frame, 2 buttons and a circle object.
 * And adds the buttons and the circle onto the frame.
 */
public class Frame {

	JButton smaller;
	JButton bigger;
	JFrame frame;
	Circle draw;
	
	/**
	 * The circle constructor creates a frame object of size 600 by 600
	 * and adds 2 JButton's and a Circle object onto the frame.
	 */
	public Frame(int width, int height){
	
		//creates the buttons
		smaller = new JButton("Smaller");
		bigger = new JButton("Bigger");
		
		//creates frame
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this lines creates a circle and the arguments are the frame width and height
		draw = new Circle(frame.getSize().width, frame.getSize().height);
		
		//listeners for the buttons
		bigger.addActionListener(new BiggerButton());
		smaller.addActionListener(new SmallerButton());
		
		//these lines add the buttons and the circle onto the frame
		frame.add(BorderLayout.SOUTH, smaller);
		frame.add(BorderLayout.NORTH, bigger);
		frame.add(BorderLayout.CENTER, draw);
		
		//set frame visible after adding buttons and circle
		frame.setVisible(true);
		
	}
	
	//inner class for action listener for Bigger button
	public class BiggerButton implements ActionListener{ // Makes Circle Bigger by Button
		
		public void actionPerformed(ActionEvent event){
			draw.enBiggen();
		}
	}
	//inner class for action listener for Smaller button
	public class SmallerButton implements ActionListener{ // Makes Circle Smaller by Button
		
		public void actionPerformed(ActionEvent event){
			draw.enSmallen();
		}
	}

}
