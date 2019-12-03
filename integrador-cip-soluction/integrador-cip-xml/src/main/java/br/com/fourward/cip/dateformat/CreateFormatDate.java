package br.com.fourward.cip.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CreateFormatDate {
	
	private SimpleDateFormat dt;
	
	public  String getDateNowFormatedDtRef(){
		dt = new SimpleDateFormat("yyyyMMdd");
		return dt.format(System.currentTimeMillis());
	}
	
	public String getDateNowFormatedDt(){
		dt = new SimpleDateFormat("yyyy-MM-dd");
		return dt.format(System.currentTimeMillis());
	}
	
	public String getDateFormatedDt(final Date date){
		dt = new SimpleDateFormat("yyyy-MM-dd");
		return dt.format(date);
	}
	
	public String getDateNowFormatedDh(){
		dt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return dt.format(System.currentTimeMillis());
	}
}