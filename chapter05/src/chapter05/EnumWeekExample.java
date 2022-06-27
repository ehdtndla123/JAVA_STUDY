package chapter05;
import java.util.Calendar;
public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=null;
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today=Week.SUNDAY; break;
			case 2:
				today=Week.TUESDAY; break;
			case 3:
				today=Week.WEDNESDAY; break;
			case 4:
				today=Week.THURSDAY; break;
			case 5:
				today=Week.FRIDAY; break;
			case 6:
				today=Week.SATURDAY; break;
			case 7:
				today=Week.Monday; break;
				
		}
		System.out.println("오늘 요일: "+ today);
	}

}
