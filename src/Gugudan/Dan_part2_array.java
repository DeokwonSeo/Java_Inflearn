package Gugudan;

public class Dan_part2_array {
	
	public static int[] calculate(int times) {
		
		int[] result = new int[9];
		
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
			
		}
		return result;
		
	}
	
	public static void print(int[] result) {
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		// 9칸 만큼 집어넣을 수 있는 배열 생성.
		
		/*int[] result = new int[9];
		
		for(int i=0; i<result.length; i++) {
			result[i] = 2 * (i+1);
			
		}
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}
		
		result = new int[9];
		
		for(int i=0; i<result.length; i++) {
			result[i] = 3 * (i+1);
			
		}
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}*/
		
		
		int[] result = calculate(3);
		for(int i=0; i< result.length; i++) {
		System.out.println(result[i]);
		}
		System.out.println("");
		
		for(int i=2;i<10;i++) {
			int[] result2 = calculate(i);
			print(result2);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		int[] time4 = calculate(4);
		print(time4);
		
		System.out.println("");
		
		int[] time5 = calculate(5);
		print(time5);
	}

}
