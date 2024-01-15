package org.example;

public class Main {
    public static void main(String[] args) {
        YazilimDepartmani yazilimDepartmani = new YazilimDepartmani();
        Iterator iterator = yazilimDepartmani.getIterator();
        while(iterator.next())
        {
            System.out.println(iterator.getItem().toString());
        }
        DonanimDepartmani donanimDepartmani = new DonanimDepartmani();
        iterator=donanimDepartmani.getIterator();
        while(iterator.next())
        {
            System.out.println(iterator.getItem().toString());
        }
    }
}