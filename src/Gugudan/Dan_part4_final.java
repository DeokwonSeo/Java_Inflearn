package Gugudan;

import java.util.Scanner;

public class Dan_part4_final {

	public static int[] calculate(int times) {

		int[] result = new int[times];

		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);

		}

		return result;
	}

	public static int[][] calculate(int times, int times2) {

		int[][] result = new int[times][times2];

		for (int j = 0; j < times - 1; j++) {
			System.out.printf("[%d단] ", j + 2);

			for (int i = 0; i <= times2 - 1; i++) {

				result[j][i] = (j + 2) * (i + 1);
				
					System.out.printf("%d * %d = %d, ", j + 2, i + 1, result[j][i]);
					
			}
			System.out.println("");
		}

		return result;
	}

	public static void print(int[] result) {

		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d * %d = %d", result[i], i + 1, result[i]);
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int number = Integer.parseInt(splitedValue[0]);
		int number2 = Integer.parseInt(splitedValue[1]);
		System.out.println("사용자가 입력한 값은 : " + number + " 과 " + number2 + " 입니다.");

		int[][] result = calculate(number, number2);
		// print(result);

	}

}
