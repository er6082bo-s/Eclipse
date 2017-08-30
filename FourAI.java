package pak;
/**
 * A bare bones abstract class for creating the AI.
 write your class as a subclass to this class
 */
public abstract class FourAI {
	/**
	 * Reads the board, evaluates the best position and returns the corresponding index.
	 * @param own matrix corresponding to the coins of the AI
	 * @param enemy matrix corresponding to the coins of the opponent
	 * @param matrixAll matrix representing the state of the board
	 * @return index of column to drop coin at
	 */
	public abstract int chooseDrop(boolean[][] own, boolean[][] enemy, boolean[][] matrixAll);
	
	/**
	 * Optional method, a fail safe in case an illegal index otherwise would be returned.
	 * @param matrixAll matrix representing the state of the board
	 * @param index index to check
	 * @return true if the coin can be dropped
	 */
	public boolean isLegalMove(boolean[][] matrixAll, int index){
		return (index < matrixAll.length && index >= 0) ? !matrixAll[index][1] : false;
	}
}
