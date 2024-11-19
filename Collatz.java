// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String corv = args[1];
		corv = corv.toUpperCase();
		char cvsv = corv.charAt(0);
		int times = 1;
		int sum = times;
		System.out.print(sum + " ");
		sum = 4;
		int incount = 2;
		if (cvsv == 'V') {
			for (int n = 1; n <= seed; n++){
				System.out.print(sum + " ");
				while (sum > 1){
					if (sum % 2 == 0) {
						sum = sum/2;
						System.out.print(sum + " ");
						incount += 1;
					}
					else{
						sum = (sum*3) + 1;
						System.out.print(sum + " ");
						incount += 1;
				}
			}
				System.out.println("(" + incount + ")");
				times += 1;
				sum = times;
				incount = 1;
			}	
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
