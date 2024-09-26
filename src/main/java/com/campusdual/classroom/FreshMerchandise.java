package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.DoubleSummaryStatistics;

public class FreshMerchandise extends Merchandise {
    
    
    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity,expirationDate);
    }


    public String getSpecificData() {

        StringBuilder sb = new StringBuilder();
        String localizacion = super.area;
        String caducidad = getFormattedDate(super.expirationDate);
        sb.append("Localización: ");
        sb.append(localizacion);
        sb.append(" Fecha: ");
        sb.append(caducidad);
        return sb.toString();
    }
    public void printSpecificData(){
        String especificdata = getSpecificData();
        System.out.println(especificdata);
    }
    public String getFormattedDate(Date fecha){
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        String fechaCaducidad = sd.format(fecha);
        return fechaCaducidad;
    }





}
