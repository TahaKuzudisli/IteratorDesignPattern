package org.example;

import java.util.ArrayList;

public class DonanimDepartmani implements Iterable {
    private ArrayList<Calisanlar> calisanlar;
    public DonanimDepartmani()
    {
        calisanlar=new ArrayList<Calisanlar>();
        calisanlar.add(new Calisanlar("Ecrin","Ulu"));
        calisanlar.add(new Calisanlar("Seda","Yılmaz"));

    }
    public ArrayList<Calisanlar> GetCalisanlar()
    {
        return calisanlar;
    }
    public ListIterator getIterator()
    {
        return new ListIterator();
    }
}
