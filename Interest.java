public class Interest{

	public static void main(String[] args){
	
		double principal = 1000.0;

		double rate = 5;

		System.out.printf("%s%20s%n", "Year", "Amout of deposit");
		
		int count = 1;

		while (count <= 6){

			for (int year = 1; year<= 10; ++year){
		
				double amount = principal * Math.pow(1.0 + (rate/100.0), year);

				System.out.printf("%4d%,20.2f%n", year, amount);
				
			}

			if (count == 6)
			break;
			
			System.out.println();
			
			System.out.printf("%s%20s%n", "Year", "Amout of deposit");

			rate = rate + 1;

			count = count + 1;
			
		
		}
		

	}


}