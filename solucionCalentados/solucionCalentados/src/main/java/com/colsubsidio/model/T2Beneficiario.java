package com.colsubsidio.model;

import java.io.Serializable;

public class T2Beneficiario implements Serializable {

    private String id;

    private String numId;

    private String tipoId;

    public T2Beneficiario(String id, String numId, String tipoId) {
        this.id = id;
        this.numId = numId;
        this.tipoId = tipoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
