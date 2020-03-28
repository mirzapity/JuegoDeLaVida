import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Game extends JPanel implements MouseListener, MouseMotionListener {
	
	private static final int CELL_SIZE = 15;
	private static final int GRID_SIZE = 30;
	
	private boolean[][] matriz = new boolean[GRID_SIZE][GRID_SIZE];
	
	public Game() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	@Override
	 public void mouseClicked(MouseEvent e) {  
	    }  
	
	 

	@Override
	public void mousePressed(MouseEvent e) {
		handleMouseEvent(e);
	}

	private void handleMouseEvent(MouseEvent e) {
		int cellX = e.getX()/CELL_SIZE;
		int cellY = e.getY()/CELL_SIZE;
		if (cellX >= 0 && cellX <GRID_SIZE && cellY >=0 && cellY <GRID_SIZE) {
		
		matriz[cellX][cellY] = true;
		Game.this.repaint();
		}
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (int x = 0; x<GRID_SIZE ; x++)
		for(int y = 0; y<GRID_SIZE ; y++)
		if (matriz[x][y]) {
			g.fillRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
		} else {
			g.drawRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		handleMouseEvent(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	
	

}
