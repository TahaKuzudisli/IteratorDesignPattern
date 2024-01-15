package org.example;

public class Calisanlar {
    private String Ad;
    private String Soyad;
    public Calisanlar(String Ad, String Soyad){
        this.Ad=Ad;
        this.Soyad=Soyad;
    }
    @Override
    public String toString()
    {
        return Ad + " " + Soyad;
    }
}
