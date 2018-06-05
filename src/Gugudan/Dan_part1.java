package Gugudan;
import java.util.Scanner;

public class Dan_part1 {

	public static void main(String[] args) {
	
	/*	
	    //2단
		System.out.println("2단");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);
		
		//공란
		System.out.println("");
		
		//3단
		System.out.println("3단");
		System.out.println(3 * 1);
		System.out.println(3 * 2);
		System.out.println(3 * 3);
		System.out.println(3 * 4);
		System.out.println(3 * 5);
		System.out.println(3 * 6);
		System.out.println(3 * 7);
		System.out.println(3 * 8);
		System.out.println(3 * 9);
	
		//공란
		System.out.println("");
			
		//4단
		System.out.println("4단");
		int result = 4 * 1;
		System.out.println(result);
		result = 4 * 2;
		System.out.println(result);
		result = 4 * 3;
		System.out.println(result);
		result = 4 * 4;
		System.out.println(result);
		result = 4 * 5;
		System.out.println(result);
		result = 4 * 6;
		System.out.println(result);
		result = 4 * 7;
		System.out.println(result);
		result = 4 * 8;
		System.out.println(result);
		result = 4 * 9;
		System.out.println(result);
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);

		//5단(while)
		int i = 1;
		while(i<10) {
			System.out.println(5* i++);
		}
	
		//6단(for)
		for(int z=1; z<10; z++) {
			System.out.println(6 * z);
		}
*/		
		// 7,8,9단 
		System.out.println("구구단 중 출력한 단은? :");
		Scanner scanner1 = new Scanner(System.in);
		int number1 = scanner1.nextInt();
		System.out.println("사용자가 입력한 값 : " + number1);
		
		if(number1 < 2 ) {
			System.out.println("입력한 값을 잘못 입력했습니다.");		
		}else if(number1 > 9) {
			System.out.println("입력한 값을 잘못 입력했습니다.");	
		}else {
			for(int j = 1 ; j<10; j++) {
				System.out.println(number1 * j);
			}
		}
		
		
		

		
	
	}
	

}
