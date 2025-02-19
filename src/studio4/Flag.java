package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(158, 158, 158);
		
		double [] x = {0.2, 0.3, 0.3};
		double [] y = {0.8, 0.8, 0.9};
		
		StdDraw.filledPolygon(x, y);
		
		double [] x2 = {0.7, 0.8, 0.7};
		double [] y2 = {0.8, 0.8, 0.9};
		
		StdDraw.filledPolygon(x2, y2);
		
		double [] x3 = {0.2, 0.3, 0.3};
		double [] y3 = {0.2, 0.1, 0.2};
		double [] x4 = {0.7, 0.8, 0.7};
		double [] y4 = {0.1, 0.2, 0.2};
		
		StdDraw.filledPolygon(x3, y3);
		StdDraw.filledPolygon(x4, y4);
		
		
		StdDraw.filledRectangle(0.5, 0.85, 0.2, 0.05);
		StdDraw.filledRectangle(0.5, 0.15, 0.2, 0.05);
		
		StdDraw.setPenColor(255, 8, 127);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.3);
		
		
		StdDraw.setPenColor(255, 255, 255);
		Font font = new Font ("Arial", Font.BOLD, 60);
		StdDraw.setFont(font);
		StdDraw.text(0.45, 0.73, "POPPI");
		
		StdDraw.setPenColor(255, 250, 0);
		
		StdDraw.filledCircle(0.6, 0.4, 0.15);
		
		StdDraw.filledEllipse(0.57, 0.5772, 0.05, 0.025);
		StdDraw.filledEllipse(0.67, 0.5772, 0.05, 0.025);
		
		
		
		StdDraw.circle(0.35, 0.64, 0.05);
		StdDraw.circle(0.35, 0.45, 0.05);
		StdDraw.circle(0.35, 0.26, 0.05);
		
		
		Font fontnew = new Font ("Arial", Font.BOLD, 45);
		StdDraw.setFont(fontnew);
		
		StdDraw.text(0.35, 0.64, "1");
		StdDraw.text(0.35, 0.45, "3");
		StdDraw.text(0.35, 0.26, "1");
		
		
		
		
		
		
		
		
		
		
	}
}