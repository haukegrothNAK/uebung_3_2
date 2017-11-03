package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double bestellwert = 5001;
		double bisherigesKundenBestellvolumen = 10000;
		boolean istPremiumKunde = false;
		double rabatt;
		double rabatt1;
		double rabatt2;
		double maxrabatt1 = 0.2;
		double maxrabatt2 = 0.15;

		if (bestellwert <= 100) {
			rabatt = 0;

		} else {
			
			if (bestellwert < 500) {
			rabatt = 0.01;

			} else {			
				if (bestellwert < 2000) {
					rabatt = 0.02;

				} else {
					if (bestellwert < 5000) {
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
		if (bestellwert/2>bisherigesKundenBestellvolumen){
			rabatt2 = 0.03;
		} else {
			rabatt2 = 0;
		}
		
		System.out.println("Bestellwert: "+ bestellwert);
		if (istPremiumKunde){
			if (rabatt*2+rabatt1+rabatt2>0.2) {
				System.out.println("Rabatt: "+ maxrabatt1);
				System.out.println("rabattierter Bestellwert: "+ ((1-maxrabatt1)*bestellwert));
			}else {
				System.out.println("Rabatt: "+ (rabatt*2+rabatt1+rabatt2));
				System.out.println("rabattierter Bestellwert: "+ ((1-(rabatt*2+rabatt1+rabatt2))*bestellwert));
			}
				
			
		}else {
			if (rabatt+rabatt1+rabatt2>0.15) {
				System.out.println("Rabatt: "+ maxrabatt2);
				System.out.println("rabattierter Bestellwert: "+ ((1-maxrabatt2)*bestellwert));
			} else {
				System.out.println("Rabatt: "+ (rabatt+rabatt1+rabatt2));
				System.out.println("rabattierter Bestellwert: "+ ((1-(rabatt+rabatt1+rabatt2))*bestellwert));
			}
		
	}

	}}
