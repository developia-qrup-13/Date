package time ;

import java.time.LocalTime ;
import java.util.Scanner ;

	public class Time {
		int s ; // saniye
  		int m ; // deqiqe
  		int h ; // saat
  	public Time (int h , int m,int  s ) {
	  	this.h=h ;
   		this.m=m ;
        this.s=s ;
  	}
   public static void main(String[] args ) {
	   LocalTime time=LocalTime.now () ;
	   int h=time.getHour() ;
	   int m=time.getMinute() ;
	   int s=time.getSecond() ;
	   Time sys = new Time ( h , m , s ) ;
	   Scanner input = new Scanner ( System.in ) ;
	   System.out.println ( " Enter hour : " ) ;
	   h = input.nextInt () ;
	   System.out.println ( " Enter minutes : " ) ;
	   m = input.nextInt () ;
	   System.out.println ( " Enter second :");
	   s = input.nextInt () ;
	   Time user = new Time (h,m,s) ;
	   Time dif ; 
	   dif=compare(user,sys);
	   System.out.println("System Time :"+sys.h+":"+sys.m+":"+sys.s);
	   System.out.println("user Time :"+user.h+":"+user.m+":"+user.s);
	   System.out.println("differnce Time :"+dif.h+":"+dif.m+":"+dif.s);

}
   public static Time compare (Time user,Time sys) {
	   Time dif = new Time(0,0,0);
	   if(user.s>sys.s) {
	   sys.m-- ;
	   sys.s += 60 ;
	   }
	   dif.s=sys.s-user.s ;
	   if (user.m>sys.m ) {
	   sys.h-- ;
	   sys.m += 60 ;
	   }
	   dif.m=sys.m-user.m ;
	   dif.h =sys.h-user.h ;
	   return  (dif) ; 
   }
	}
	