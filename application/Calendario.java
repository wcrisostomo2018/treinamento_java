package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;



public class Calendario {

	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	
	System.out.println(sdf.format(d));
	
	Calendar cal = Calendar.getInstance();
	
	cal.setTime(d);
	cal.add(Calendar.HOUR_OF_DAY, 4);
	d = cal.getTime();
	System.out.println(sdf.format(d));
	

	int mes = 1 + cal.get(Calendar.MONTH);
	System.out.println("Mês: " + mes);
	int dia = cal.get(Calendar.DAY_OF_MONTH);
	System.out.println("Dia: " + dia);
	int ano = cal.get(Calendar.YEAR);
	System.out.println("Ano: " + ano);
	System.out.println();
	
	int hora = cal.get(Calendar.HOUR);
	System.out.println("Hora: " + hora);
	int minuto = cal.get(Calendar.MINUTE);
	System.out.println("Minutos: " + minuto);
	int segundo =  cal.get(Calendar.SECOND);
	System.out.println("Segundos: " + segundo);
	

	}

}
