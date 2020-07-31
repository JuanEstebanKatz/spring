package com.sohpos.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class Utilidades {
	
	public static final String USUARIOMODIFICACION = "mkatz";
	/**
	 * 
	 * @param fechaNacimiento
	 * @return
	 * @throws ParseException
	 */
	public boolean mayorEdad(Date fechaNacimiento) throws ParseException {
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	    Date ahora = new Date();
	    simpleDateFormat.format(ahora);
	    
		Date fechaInicial = simpleDateFormat.parse(fechaNacimiento.toString());
		
		int dias=(int) ((ahora.getTime()-fechaInicial.getTime())/86400000);
		double ans= (double) dias/365;
		//System.out.println(ans);
		if(ans>=18)
			return true;
		else
			return false;
	}

}
