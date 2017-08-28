package pak;

import java.awt.Color;


public class Block {
	private int x;
	private int y;
	private int blockSize = 76;
	private SimpleWindow w;	

	
	/*creates a block with the upper left corner in (x,y)
	 */
 
	public Block(int x, int y, SimpleWindow w) {
		this.x = x;
		this.y = y;
		int left = x * blockSize;
		int right = left + blockSize - 1;
		int top = y * blockSize;
		int bottom = top + blockSize - 1;
		w.setLineColor(Color.blue);
		for (int row = top; row <= bottom; row++) {
			w.moveTo(left, row);
			w.lineTo(right, row);
		}
		w.setLineColor(Color.black);
		w.moveTo(left, top);
		w.lineTo(right, top);
		w.lineTo(right, bottom);
		w.lineTo(left, bottom);
		w.lineTo(left, top);

	}
}
