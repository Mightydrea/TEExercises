package postOffice;

public class FexEd implements IDeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {

		double deliveryRate = 20.00;

		if(distance > 500 && weight > 48) {
			
			deliveryRate += (5.00 + 3.00);
		}
		
		if (distance > 500) {

			deliveryRate += 5.00;
			
			return deliveryRate;
		}
		if (weight > 48) {

			deliveryRate += 3.00;
			
			return deliveryRate;
		}
		return deliveryRate;

	}

	@Override
	public String deliveryMethod() {
		// TODO Auto-generated method stub
		return "FexEd";
	}

}
