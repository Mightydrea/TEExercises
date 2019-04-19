package postOffice;

public class secondClassPostal implements IDeliveryDriver {

	
	@Override
	public double calculateRate(int distance, double weight) {

		double deliveryRate = 0.00;
	
		if (weight >= 0 && weight <= 2) {

			deliveryRate = 0.0035 * distance;
		}
		else if (weight >= 3 && weight <= 8) {

			deliveryRate = 0.0040 * distance;

		}
		else if (weight >= 9 && weight <= 15) {

			deliveryRate = 0.0047 * distance;
		} 
		else if (weight >= 16 && weight <= 48) {

			deliveryRate = 0.0195 * distance;
		} 
		else if (weight >= 49 && weight <= 128) {

			deliveryRate = 0.0450 * distance;
		} 
		else if (weight >= 129) {

			deliveryRate = 0.0500 * distance;
		}
		return deliveryRate;
	}

	@Override
	public String deliveryMethod() {

		return "Postal Service (2nd Class)";
	}
}
