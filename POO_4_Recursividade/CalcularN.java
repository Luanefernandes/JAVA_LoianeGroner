package POO_4_Recursividade;

public class CalcularN {
		
		public static int fibonacci(int num) {
			
			if(num<2) {
				return 1;
			}
			
			return fibonacci (num-1) + fibonacci(num-2);
		
		}
		
		//5 = 5+4+3+2+1, etc
		public static int somatorio (int num) {
			
			return num + somatorio(num-1);
			
		}

}
