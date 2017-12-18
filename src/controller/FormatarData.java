package controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatarData {
    
    Date novaData;
    
    public FormatarData(String data) throws ParseException {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        novaData = dataFormatada;
    }
    
    public Date getData() {
        return this.novaData;
    }
    
}
