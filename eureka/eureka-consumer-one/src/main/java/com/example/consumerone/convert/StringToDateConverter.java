package com.example.consumerone.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {;

    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date convert(String source) {
        Date parse = null;
        try {
            parse = sf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
