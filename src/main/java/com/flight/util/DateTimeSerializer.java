package com.flight.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateTimeSerializer  extends JsonSerializer<Date>{
 private String format="yyyy-MM-dd HH:mm:ss";
	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		
		gen.writeString(new SimpleDateFormat(format).format(value));
	}

}
