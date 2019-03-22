package com.colsubsidio.model;

import java.io.Serializable;

public class ReportePiloto implements Serializable{

    private String idVenta;

    private String numId;

    private String tipoId;

    public ReportePiloto(String idVenta, String numId, String tipoId) {
        this.idVenta = idVenta;
        this.numId = numId;
        this.tipoId = tipoId;
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

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    @Override
    public String toString() {
        return "ReportePiloto{" +
                "idVenta='" + idVenta + '\'' +
                ", numId='" + numId + '\'' +
                ", tipoId='" + tipoId + '\'' +
                '}';
    }
}
