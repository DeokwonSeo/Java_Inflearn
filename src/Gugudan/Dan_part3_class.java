package Gugudan;

public class Dan_part3_class {

	public static void main(String[] args) {
		
		for(int i=2;i<10;i++) {
			int[] result = Dan_part2_array.calculate(i);
			Dan_part2_array.print(result);
		}
	}
	
}
