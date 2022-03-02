
public class Matrix {

	public static void main(String[] args) {
		final int[][] a = {{ 2,6,8 },{ 4,8,6},{4,6,9}};
			for (int r = 0; r < a.length; r++) {       
			for (int c = 0; c < a[r].length; c++) {   
			System.out.print(a[r][c] + " ");
			}
			System.out.println();
			}
			

	}

}
