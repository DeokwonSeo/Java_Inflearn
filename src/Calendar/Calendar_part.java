package Calendar;


import java.util.Scanner;

public class Calendar_part {
	
	private final int[] Max_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private final int[] LEAP_Max_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	private final String Promport = "cal> ";
	
	public boolean isLeepYear(int year) {
		
		if (year % 4 ==0 && year % 100 != 0 || year % 400 !=0 ) {return true;}
		
		return false;
	}
	public int GetmaxDaysOfMonth(int month) {
		
		return Max_DAYS[month-1];
		
	}
	public int GetmaxDaysOfMonth2(int year,int month) {
		if (isLeepYear(year)) {
		return LEAP_Max_DAYS[month-1];
		}else {
		return Max_DAYS[month-1];
		}
	}
	
	public void SampleCalendar(int year,int month){
		System.out.printf("   <<%4d년%3d월>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		
		if(isLeepYear(year)) {
			
		}
		int maxDay = GetmaxDaysOfMonth2(year,month);
		
		for(int i=1; i<maxDay+1; i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.println("");
			}
			
		}
		System.out.println("");
		System.out.println("");
		
/*		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("");*/
	
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
	public void ForTimes() {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Calendar_part cal = new Calendar_part();
		
		System.out.println("반복횟수를 입력하세요.\n");
		System.out.print(Promport);
		
		int repeat = scanner.nextInt();
		
		for( int i=0; i<repeat; i++) {
		
			System.out.println("달을 입력해주세요: \n");
			
			int month = scanner.nextInt();
			
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,cal.GetmaxDaysOfMonth(month));
				
			
		}
		System.out.println("End");
		scanner.close();
	}
	public void MonthCalendar() {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램.
		
		String Promport = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar_part cal = new Calendar_part();
		
		int month = 1;
		
		//whlie(true)경우 무한루프 이다. 무한루프를 막아주기를 위해서는, 안에 break를 넣어준다.
		while(true) {
		
			System.out.println("달을 입력해주세요. ");
			System.out.println(Promport);
			month = scanner.nextInt();
			
			
			if(month >= 1 && month <=12 ) {
				System.out.printf("\n%d월은 %d일까지 있습니다.\n\n",month,cal.GetmaxDaysOfMonth(month));
				continue;
			}else {
				System.out.println("End");
				break;
			}
		}
				
		scanner.close();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar_part cal = new Calendar_part();
		
		int month = -1;
		int year =  -1;
		
		//whlie(true)경우 무한루프 이다. 무한루프를 막아주기를 위해서는, 안에 break를 넣어준다.
		while(true) {
			System.out.println("년도를 입력해주세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력해주세요. ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			
			
			if(month >= 1 && month <=12 ) {
				cal.SampleCalendar(year,month);
				continue;
			}else {
				System.out.println("End");
				break;
			}
		}
				
		scanner.close();
		
		
	}
}
