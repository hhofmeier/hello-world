
public class Kontrollfluss {

	public static void main(String[] args) {
		
		/*//Subtraktion
		int a = 12;
		int b = 3;
		int res;
		
		if(a < b){
			res = b - a;
		} else {
			res = a - b;
		}
		
		System.out.println(res);
		
		//Betrag a)
		double c = 0.45;
		
		if(c < 0){
			c *= -1;
		}
		
		System.out.println(c);
		
		//Betrag b)
		double d = -0.67;
		
		System.out.println(Math.abs(d));
		
		//Schaltjahr a)
		int jahr = 2017;
		
		if((jahr % 400) == 0){
			System.out.println(jahr + " ist ein Schaltjahr.");
		} else if ((jahr % 4) == 0){
			if((jahr % 100) != 0){
				System.out.println(jahr + " ist ein Schaltjahr.");
			}
		} else {
			System.out.println(jahr + " ist kein Schaltjahr.");
		}
		
		//Schaltjahr b)
				
		if ((jahr % 400) == 0) {
			System.out.println(jahr + " ist ein Schaltjahr.");
		} else if ((jahr % 4) == 0 && (jahr % 100) != 0) {
			System.out.println(jahr + " ist ein Schaltjahr.");
		} else {
			System.out.println(jahr + " ist kein Schaltjahr.");
		}
		
		//Schaltjahr b)
		
		if ((jahr % 400) == 0 || ((jahr % 4) == 0 && (jahr % 100) != 0)) {
			System.out.println(jahr + " ist ein Schaltjahr.");
		} else {
			System.out.println(jahr + " ist kein Schaltjahr.");
		}
		
		//Schleifen1
		for(int i = 1; i < 6; i++){
			System.out.println(i);
		}
		
		int e = 1;
		
		do{
			System.out.println(e);
			e++;
		} while(e < 6);
		
		e = 1;
		while(e < 6){
			System.out.println(e);
			e++;
		}
		
		//Schleifen2
		double time = System.currentTimeMillis();
		
		while(time % 5 != 0){
			System.out.println("Waiting...");
			time = System.currentTimeMillis();
		}
		
		System.out.println("Done!");
		
		//Schleifen3
		for(int i = 1024; i > 0; i /= 2){
			System.out.println(i);
		}*/
		
		//Schleifen4
		int num;
		int ges = 0;
		do{
			num = (int) (Math.random() * 6) + 1;
			ges += num;
			System.out.println("Wurf: " + num);			
		}while(num == 6);
		System.out.println("Gesamtaugenzahl: " + ges);
		
		//Schleifen5
		double res = 0.0;
		double zw = 1.0;
		for(double i = 1.0; i <= 18; i++){
			for(double j = i; j <= (2 * i); j++){
				zw *= j / i;
			}
			res += zw;
			zw = 1;
		}
		System.out.println(res);
		
		//Collatz
		int a = 33;
		int anzahl = 0;
		
		while(a > 1){
			if((a % 2) == 0){
				a /= 2;
			} else {
				a = 3 * a + 1;
			}
			anzahl++;
		}
		System.out.println("a = " + a + ", nach " + anzahl + " Schleifendurchlaeufen.");
	}

}
