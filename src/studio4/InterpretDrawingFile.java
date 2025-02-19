package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int Red = in.nextInt();
		int Green = in.nextInt();
		int Blue = in.nextInt();
		Boolean filled = in.nextBoolean();
		
		
		
		StdDraw.setPenColor(Red,Green,Blue);
		if(filled) {
			if(shape.equals("rectangle")){
				Double X = in.nextDouble();
				Double Y = in.nextDouble();
				Double halfWidth = in.nextDouble();
				Double halfLength = in.nextDouble();
				StdDraw.filledRectangle(X, Y, halfWidth, halfLength);
			
		}
			else if(shape.equals("ellipse")) {
				Double X = in.nextDouble();
				Double Y = in.nextDouble();
				Double halfWidth = in.nextDouble();
				Double halfLength = in.nextDouble();
				StdDraw.filledEllipse(X, Y, halfWidth, halfLength);
				
			} else if(shape.equals("triangle")) {
				double[] x = new double[3];
				double[] y = new double[3];
				x[0] = in.nextDouble();
				x[1] = in.nextDouble();
				x[2] = in.nextDouble();
				y[0] = in.nextDouble();
				y[1] = in.nextDouble();
				y[2] = in.nextDouble();
				StdDraw.filledPolygon(x,y);
				
			}
			
		
		
	}
		
}
}