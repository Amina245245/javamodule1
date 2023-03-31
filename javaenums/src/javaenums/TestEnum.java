package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DayofWeek today=DayofWeek.SATURDAY;
System.out.println("Today is"+ today.getName());
//this would output:"Today is  saturday

switch(today)
{
case MONDAY:
	System.out.println("work hard");
	break;
	
case TUESDAY:
	System.out.println("work little more");
	break;
	
case WEDNESDAY:
	System.out.println("work work little more");
	break;
case THURSDAY:
	System.out.println("work work work more,WEEKEND is AROUND");
    break;
    
case FRIDAY:
	System.out.println("YEAH weekend has arrived,party hard");
	break;
case SATURDAY:
	System.out.println("enjoy morning coffee, go shopping");
	break;
case SUNDAY:
	System.out.println("do all cleaning works,SNOOOOOZZZZZZ");
	
}
	}

}
