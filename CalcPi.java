// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int pin = Integer.parseInt(args[0]);
		double closepi = 0;
		double mechane = 1;
		for (int picount = 0; picount < pin; picount++){
			if (picount % 2 ==0) {
				closepi += 1/mechane;
			}
			else{
				closepi -= 1/mechane;
			}
			mechane += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + closepi*4);
	}
}
