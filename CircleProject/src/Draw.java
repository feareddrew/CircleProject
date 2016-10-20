import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draw extends JPanel {
	
	private int startPointX;
	private int startPointY;
	private int circleDiameter;
	
	public Draw(int width, int height)
	{
		circleDiameter = 100;
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
