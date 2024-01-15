package org.example;
public class ArrayIterator implements Iterator {
    private YazilimDepartmani yazilimDepartmani = new YazilimDepartmani();
    private int index=0;
    public Object getItem()
    {
        Calisanlar calisan = yazilimDepartmani.GetCalisanlar()[index];
        index++;
        return calisan;
    }
    public boolean next()
    {
        if(index<yazilimDepartmani.GetCalisanlar().length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}