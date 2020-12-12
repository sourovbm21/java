package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datePractise {

	public static void main(String[] args) {
		
   LocalDate ld=LocalDate.now();
   System.out.println(ld);
   LocalTime lt=LocalTime.now();
   System.out.println(lt);
   LocalDateTime ldt=LocalDateTime.now();
   System.out.println("before formatting : "+ldt);
   DateTimeFormatter formated_date= DateTimeFormatter.ofPattern("E,yyyy-MMM-dd HH:mm:ss");
   String new_formated_date=ldt.format(formated_date);
   System.out.println("after formating : "+new_formated_date);
   
   ///this is m test 
   System.out.print("sourov");
		
	}

}
