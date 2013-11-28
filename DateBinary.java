import java.util.*;
import java.text.*;

class DateBinary {
	public static void main(String[] args) {
		int year, month, day;
		Calendar cal = Calendar.getInstance();
		for (year = 1964; year <= 2020; year++){
			for (month = 0; month < 12; month++){
				cal.set(year, month, 1);
				int maxDate = cal.getActualMaximum(Calendar.DATE);
				for (day = 1; day <= maxDate; day++){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					cal.set(year, month, day);
					String strDate = sdf.format(cal.getTime());
					String binary = Integer.toBinaryString(Integer.parseInt(strDate));
					
			        StringBuffer sb = new StringBuffer(binary);
			        binary = sb.reverse().toString();
			        
			        int dec = Integer.parseInt(binary, 2);
			        
			        String sYear = Integer.toString(year);
			        String sMonth = String.format("%02d", month + 1);
			        String sDay = String.format("%02d", day);
					if ((sYear + sMonth + sDay).equals(Integer.toString(dec))){
						System.out.println(Integer.toString(dec));
					}
				}
			}	
		}
	}
}
