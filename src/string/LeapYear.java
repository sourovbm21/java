package string;
public class LeapYear {

    public static void main(String[] args) {

    	//all century year is divisible by 4
    	//it ending with 00
    	//century year is a leap year when it is perfectly divisible by 400;
    	
    	
        int year = 2024;
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        
        findingLeapYear(2027);
       
        
    }
    
    
    public static void findingLeapYear(int year){
    	
    
    	boolean leap=false;
    	
    	if (year%4==0) {
    		if(year %100==0) {//it is century year or not 
    			if(year%400==0) {
    				leap=true;
    				
    			}else
    				leap=false;
    			
    		}else
    			leap=true;
    		
    	}else
    		leap=false;
    	
    	if(leap) {
    		System.out.println("it is a leap year ");
    	}else 
    		System.out.println("it is a not leap year ");

    }
    
    
    
    
    
}