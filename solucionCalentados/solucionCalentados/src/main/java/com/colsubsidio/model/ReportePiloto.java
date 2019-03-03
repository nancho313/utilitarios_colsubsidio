package com.colsubsidio.model;

import java.io.Serializable;

public class ReportePiloto implements Serializable{

    private String idVenta;

    private String numId;

    public ReportePiloto(String idVenta, String numId) {
        this.idVenta = idVenta;
        this.numId = numId;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    @Override
    public String toString() {
        return "ReportePiloto{" +
                "idVenta='" + idVenta + '\'' +
                ", numId='" + numId + '\'' +
                '}';
    }
}
