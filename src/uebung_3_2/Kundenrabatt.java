package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double bestellwert = 2;
		double bisherigesKundenBestellvolumen = 1;
		boolean istPremiumKunde = false;
		double rabatt;
		double rabatt1;
		double rabatt2;

		System.out.println("Bestellwert ohne Rabatt = " + bestellwert);

		if (bestellwert > 100) {
			rabatt = 0.01;

		} else {
			if (bestellwert > 100) {
				rabatt = 0.01;

			} else {
				if (bestellwert > 500) {
					rabatt = 0.02;

				} else {
					if (bestellwert > 2000) {
						rabatt = 0.03;

					} else {
						rabatt = 0.05;

					}
				}
			}
		}
		if (bisherigesKundenBestellvolumen > 10000) {
			rabatt1 = 0.075;
		} else {
			if (bisherigesKundenBestellvolumen > 50000) {
				rabatt1 = 0.125;
			} else {
				rabatt1 = 0;

			}
		}

	}

}
