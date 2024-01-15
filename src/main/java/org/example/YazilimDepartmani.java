package org.example;

public class YazilimDepartmani implements Iterable{
    private Calisanlar[] calisanlar;
    public YazilimDepartmani()
    {
        calisanlar= new Calisanlar[3];
        calisanlar[0]=new Calisanlar("Yaren", "Ulusoy");
        calisanlar[1]=new Calisanlar("Esra","Dinç");
        calisanlar[2]=new Calisanlar("Sibel","Ak");
    }
    public Calisanlar[] GetCalisanlar()
    {
        return calisanlar;
    }
    public ArrayIterator getIterator()
    {
        return new ArrayIterator();
    }

}