package com.mycompany.adminestacionamiento;

public class Consecutivo {
    private long numero;
    public Consecutivo(){
        this.numero = 0;
    }
    public long getConsecutivo(){
        this.numero++;
        return this.numero;
    }
}
