package workshop;

import java.awt.image.BufferedImage;

import java.awt.event.MouseMotionListener;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener{
	BufferedImage maze;
	final int frameWidth = 500;
	final int frameHeight = 500;
	
	
	public static void main(String[] args) throws IOException {
		SwingUtilities.invokeLater(new ScaryMaze());
	}
	
	ScaryMaze() throws IOException {
		maze = ImageIO.read(getClass().getResource("Maze.jpg"));	
		addMouseMotionListener(this);
	}
	
	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPrefferedSize(new Dimention(FrameWidth, FrameHeight));
		frame.pack();
		frame.setVisiable(true);
	}
	
	@Override
}
