package methodss;

import java.util.Scanner;

public class Metodlar {
	  static Scanner in= new Scanner(System.in);	
		
	public static   void kilomer (){
		
	
		  
		 System.out.println("kilometre girniz");
	
		 int a = in.nextInt();
	  
		 System.out.println(a +" "+ "sayisi"+" " +(a*1.6)+"  "+"mildir");
	  }
	
	public static void toplama(int a, int b, int c) {
		
		
		
		System.out.println("Sayilarin toplami="+" "+ (a+b+c)+" "+"dir");
	}
	
	public static   void comparison (int a, int b) {
		
		if (a > b) {
			System.out.println("a b'den buyuktur");
		}
		else if(a<b) {
			System.out.println("a b'den kucuktur");
		}
		else {
			System.out.println("a b'ye esittir");
		}
			
		}
        public static void yildiz(int k) {
        	
        	for (int i=0; i<=k;i++){
        		for(int j=0;j<i;j++) {
        		
        		System.out.print("*");
        			}System.out.println();
	}}
        public static void method1(String a, int b) {
    		
    		for (int i=0;i<b;i++) {
    			
    			System.out.print(a);}}
        
       public static void method2(int a, int b) {
    	   if((a+b==6)||(a-b==6)||(a==6)||(b==6)) {
    		   System.out.print("true");
    	   }
    	   else {
    		   System.out.print("false");}
    	   }
       
       public static void method3(int k){
    	   while ((k%11==0)||(k%11==1)){
    		   System.out.print("true"); 
    		   break;
    	   }
    	  
    		   
    	   
       }
       public static void method4(int t, boolean isSummer) {
    	   if(((t>60&&t<90)&& isSummer==true)||((t>60&&t<100)&& isSummer!=true)){
    		   
    		   System.out.println("true");
    		   
    	   }
    	   else {
    		   System.out.println("false");
    		   
    	   }
       }
       public static   int method5(int s, boolean isBirthday) {
    	    if(isBirthday) {
    	        if(s <= 65) {
    	            return 0;
    	        } else if(66 <= s && s <= 85) {
    	            return 1;
    	        } else if(86 <=  s) {
    	            return 2;
    	        }
    	    }
    	                                        
    	    if(s <= 60) {
    	        return 0;
    	    } else if(61 <= s && s <= 80) {
    	        return 1;
    	    } else {
    	        return 2;
    	    }
    	}
       public static void method6(int c, boolean isWeekend) {
    	   
    	   if (isWeekend) {
    		   if(c>40 && c<60) {
    			   System.out.println("true");
    			   
    		   }
    		   else {
    			   System.out.println("false");
    			   
    		   }
  
    	   }
    	   else if(!isWeekend) {
    		   if(c>40) {
    			   System.out.println("true");
    			   
    		   }
    		   else {
    			   System.out.println("false");
    			   
    		   }
    	   }
       }
		
       

	
	public static void main(String [] args) {

		method6(55,true );
	  
	  		
	}

	
}
