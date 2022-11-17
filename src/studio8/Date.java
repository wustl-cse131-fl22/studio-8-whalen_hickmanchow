package studio8;

import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	private boolean holiday;
	
	public Date(int theDay, int theMonth, int theYear, boolean theHoliday) {
		day=theDay;
		month=theMonth;
		year=theYear;
		holiday=theHoliday;
	}
	
	public boolean getHoliday() {
		return holiday;
	}
		
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return getMonth()+"."+getDay()+"."+getYear()+" Is a Holiday: "+getHoliday();
	}

	public int hashCode() {
		return Objects.hash(day, month, year);
	}
 
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date d1= new Date(11,11,2001,true);
		Date d2= new Date(11,11,2001,false);
		System.out.println(d1.equals(d2));
    }

}
