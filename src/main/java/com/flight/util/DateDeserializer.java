package com.flight.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class DateDeserializer extends JsonDeserializer<Date> {

	
	
	
	public DateDeserializer() {
		
	this(null);
	}

	public DateDeserializer(Class<?> object) {
	
		super();
	}

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
	
		String date=p.getText();
		SimpleDateFormat sdt= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdt1= new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss");
		SimpleDateFormat sdt2= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return sdt.parse(date);
		}
		catch(ParseException e)
		{
			try {
				return sdt1.parse(date);
			}
			catch(ParseException e1)
			{
				try {
					return sdt2.parse(date);
				}
				catch(ParseException e2)
				{
					e2.printStackTrace();
				}
			
		}
	}
return null;
	}
}
