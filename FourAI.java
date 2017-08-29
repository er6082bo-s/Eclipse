package pak;

public abstract class FourAI {
	/**
	 * Reads the board, evaluates the best position and returns the corresponding index.
	 * @param matrix1 matrix corresponding to the coins of Player 1
	 * @param matrix2 matrix corresponding to the coins of Player 2
	 * @param matrixAll matrix representing the state of the board
	 * @return index of column to drop coin at
	 */
	public abstract int chooseDrop(boolean[][] matrix1, boolean[][] matrix2, boolean[][] matrixAll);
	
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
