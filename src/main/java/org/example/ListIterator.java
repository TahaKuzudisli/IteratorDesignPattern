package org.example;

public class ListIterator implements Iterator{
    private DonanimDepartmani donanimDepartmani= new DonanimDepartmani();
    private int index=0;
    public Object getItem()
    {
        Calisanlar calisan =donanimDepartmani.GetCalisanlar().get(index);
        index++;
        return calisan;
    }
    public boolean next()
    {
        if(index<donanimDepartmani.GetCalisanlar().size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}