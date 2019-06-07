package sec06.aulas.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoData {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = new Date("01/01/2018");//Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		cal.add(Calendar.DAY_OF_WEEK, 2);
		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));

	}

}
