package day1;

		public class PatternD {
		    public static void main(String[] args) {
		        int n = 7; // height of the pattern

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j <= n; j++) {
		                // Conditions to draw 'D'
		                if (j == 0 || 
		                    (i == 0 && j < n - 1) || 
		                    (i == n - 1 && j < n - 1) || 
		                    (j == n - 1 && i != 0 && i != n - 1)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
	}
