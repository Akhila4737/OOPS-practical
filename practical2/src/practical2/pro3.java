package practical2;

import java.util.Date;

public class pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Date dt=new Date();
		        System.out.println("Current date:"+dt);
		        int month=dt.getMonth();
		        System.out.println("month is:"+month);
		        int year=dt.getYear();
		        System.out.println("year is:"+year);
		        Date d1=new Date(2000,11,21);
		        Date d2=new Date();
		        Date d3=new Date(2011,1,3);
		        boolean a=dt.after(d1);
		        System.out.println();
	}    

}
