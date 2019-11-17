/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vinicius Espindola
 */
public abstract class DateHelper {

    static String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
    static Pattern patternDate;
    static Matcher matcherDate;

    
    static boolean isDate(String data) {
        patternDate = Pattern.compile(regex);
        matcherDate = patternDate.matcher((CharSequence)data);
        return matcherDate.matches();

    }
    
    static Date toDate(String date) throws ParseException {
        if(DateHelper.isDate(date)){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           return  sdf.parse(date);
        }
        return null;
    }
    static String toDateString(Date data) {
        DateFormat  formataData = DateFormat.getDateInstance();
        return formataData.format(data);

    }

}

class Main {

    public static void main(String[] args) throws ParseException {
        Date teste = DateHelper.toDate("16/11/2019");
        System.out.println(teste);
        String teste2 = DateHelper.toDateString(teste);
        System.out.println(teste2);
    }

}
