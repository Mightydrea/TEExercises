package postOffice;

public class thirdClassPostal implements IDeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {

		double deliveryRate = 0.00;
		
		if (weight >= 0 && weight <= 2) {

			deliveryRate = 0.0020 * distance;

		}

		else if (weight >= 3 && weight <= 8) {

			deliveryRate = 0.022 * distance;

		}

		else if (weight >= 9 && weight <= 15) {

			deliveryRate = 0.0024 * distance;
		}

		else if (weight >= 16 && weight <= 48) {

			deliveryRate = 0.0150 * distance;
		} else if (weight >= 4 && weight <= 8) {

			deliveryRate = 0.0160 * distance;
		} else if (weight >= 9) {

			deliveryRate = 0.0170 * distance;
		}
		return deliveryRate;
	}

	@Override
	public String deliveryMethod() {

		return "Postal Service (3rd Class)";
	}
}
