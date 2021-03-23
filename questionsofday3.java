package day_3;

import java.util.Scanner;

public class questionsofday3 {
	public static void main (String args[]) {
	
	
	int count=1;
	System.out.println(count);
	
	/*question 1 */
	String message="hello";
	System.out.println(message);
	/*question 2 */
	
	int num=3; double cost=1.1;
	System.out.println(num +" "+ cost);
	/*question 3 */
	
	String word=" Ciao bella";
	System.out.println("Today's Word-Of-The-Day is:"+word);
	/*question 4 */
	int first,second;
	first=2; second=3;
	System.out.println("first is"+" "+ first +" "+"second="+ second);
	/*question 5 */
	
	String a,b,c,d,e;
	a="Bob"; b="James"; c="Herb"; d="Betty"; e="Jill";
	System.out.println(e+","+a+","+b+","+c+","+d);
	/*question 6 */
	int i=5; float f=(float) 33.564;
	System.out.println("i="+i +" "+"f="+f);
	/*question 7 */
	
	String j="\"Java\""; String s="\"SQL\"";
	System.out.println("I will learn" +" "+j+"  "+"and"+" "+ s+" "+"at CybertekSchool" );
	
	/*question 8 */
	
	byte steps=100; short miles=500; int count1=1000000; long population=34344567;
	
	/*question 9 */
	Scanner scan= new Scanner(System.in);
	
	
	String am,pm; am="AM"; pm="PM";
	
	System.out.println("enter the hour :");
	int hour=scan.nextInt();
	System.out.println("ebter the minute :");
	int minute=scan.nextInt();
	System.out.println("ebter the second :");
	int seconds=scan.nextInt();
	
	
	if (hour>12) {
	 System.out.println("The times is:"+hour+":"+minute+":"+seconds+pm);}
	else {
		System.out.println("The times is:"+hour+":"+minute+":"+seconds+am);
		
		 System.out.println("first is"+" "+ first +" "+"second="+ second); System.out.println("first is "+ first +" second= "+ second);}

	
	
	
	
	
	
	
	}
	
	
	

}
