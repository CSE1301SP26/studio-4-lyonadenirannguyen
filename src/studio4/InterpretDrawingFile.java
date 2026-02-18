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
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		Boolean yesno = in.nextBoolean();
		Double x = in.nextDouble();
		Double y = in.nextDouble();
		Double halfwidth = in.nextDouble();
		Double halfheight = in.nextDouble();
		StdDraw.setPenColor(red, green, blue);
		
		if(shape == "rectangle_black_outlined.txt"){
			StdDraw.rectangle(x, y, halfwidth, halfheight);
		}
	//if(shape == purpleellipse){
			//StdDraw.ellipse(x, y, halfwidth, halfheight);
		}
		if(shape == redellipse){
			StdDraw.filledEllipse(x, y, halfwidth, halfheight);
		}





		
	}
}
