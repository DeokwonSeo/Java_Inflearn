package Calendar;


import java.util.Scanner;

public class Calendar_part {
	
	private final int[] Max_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int GetmaxDaysOfMonth(int month) {
		return Max_DAYS[month - 1];
	}
	public void SampleCalendar(){
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	
	}
	public void MyMadTheCalendar() {
		System.out.println("최대 일수를 알고 싶은 달을 입력해주세요 : ");
		Scanner scanner1 = new Scanner(System.in);
		String s1;
		s1 = scanner1.next();
		int a = Integer.parseInt(s1);
		
		if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
			System.out.printf("%d월의 최대 일수는 31일 입니다.",a);
		}else if(a==2) {
			System.out.printf("%d월의 최대 일수는 28일 입니다.",a);
		}else {
			System.out.printf("%d월의 최대 일수는 30일 입니다.",a);
		}
		scanner1.close();
	}
	
	public static void main(String[] args) {
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램.
		
		Scanner scanner = new Scanner(System.in);
		
		Calendar_part cal = new Calendar_part();
		
		System.out.println("달을 입력해주세요: \n");
		
		int month = scanner.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.",month,cal.GetmaxDaysOfMonth(month));
		
		scanner.close();
		
	}
}
