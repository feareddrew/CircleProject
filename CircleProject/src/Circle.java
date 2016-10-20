import javax.swing.*;
import java.awt.*;
/*
 * this class creates a circle with an initial diameter of 100
 * and base on the size of the frame it sets the x,y position of the circle.
 */
public class Circle extends JPanel {
	
	private int startPointX;
	private int startPointY;
	private int circleDiameter;
	
	public Circle(int width, int height)
	{
		circleDiameter = 100; //set initial circle diameter
		startPointX = (width / 2) - (circleDiameter / 2);
		startPointY = (height / 2) - (circleDiameter / 2);
	}

	public void enSmallen() {
		startPointX = startPointX + 10;
		startPointY = startPointY + 10;
		circleDiameter  = circleDiameter - 20;

		repaint();
	}
	
	public void enBiggen() {
		startPointX = startPointX - 10;
		startPointY = startPointY - 10;
		circleDiameter = circleDiameter + 20;

		repaint();
	}
	
	public void paintComponent(Graphics g){
		
		//Sets color To Blue And Fills It
		g.setColor(Color.blue);
		g.fillOval(startPointX, startPointY, circleDiameter, circleDiameter);
	}
}
