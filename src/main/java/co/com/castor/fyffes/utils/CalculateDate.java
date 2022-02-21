package co.com.castor.fyffes.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateDate {

    public String CurrentYearCal() {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        String currentYear = getYearFormat.format(fecha);

        return "//span[contains(text(),'"+String.valueOf(currentYear)+"')]";
    }

    public String LastYearCal() {
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        Date fecha = new Date();
        int currentYear = Integer.parseInt(getYearFormat.format(fecha))-1;

        return "//span[contains(text(),'"+String.valueOf(currentYear)+"')]";
    }







}
