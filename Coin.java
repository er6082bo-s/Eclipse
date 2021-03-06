package pak;

import java.awt.Color;


public class Coin {
	private int x;
	private int y;
	private int coinRadius;
	private int blockSize;
	private SimpleWindow w;

	/*creates a coin in the block with the upper left corner in (x,y)
	  */
	 
	public Coin(int x, int y, SimpleWindow w, Color c) {
		coinRadius =32;
		blockSize= 76;
		this.x = x * blockSize + blockSize/2;
		this.y = y * blockSize + blockSize/2;
		w.setLineColor(c);
		for (int deg = 0; deg <= 360; deg++) {
			w.moveTo(this.x, this.y);
			int xc = (int) Math.round(this.x + coinRadius * Math.cos(deg * (Math.PI / 180)));
			int yc = (int) Math.round(this.y + coinRadius * Math.sin(deg * (Math.PI / 180)));
			w.lineTo(xc, yc);
		}

	}

	/*get the x-coordinate of the upper left corner of the block in which the coin is */
	
	public int getX() {
		return (x -37) / 74;
	}

	/*get the y-coordinate of the upper left corner of the block in which the coin is */
	
	public int getY() {
		return (y - 37) / 74;
	}
}
