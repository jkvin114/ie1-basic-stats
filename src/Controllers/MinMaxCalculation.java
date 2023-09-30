//minmax calculation
import java.util.ArrayList;
public class MinMaxCalculation{
	public MinMaxCalculation(){
		
	}
	public double min(ArrayList<Double> numbers) {
		double minVal = Double.MAX_VALUE;
		for(double n: numbers) {
			if(n < minVal)
				minVal = n;
		}
		return minVal;
	}
	public double max(ArrayList<Double> numbers) {
		double maxVal = Double.MIN_VALUE;
		for(double n: numbers) {
			if(n > maxVal)
				maxVal = n;
		}
		return maxVal;
	}
}