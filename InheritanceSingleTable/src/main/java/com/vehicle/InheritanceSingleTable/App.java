package com.vehicle.InheritanceSingleTable;

import com.vehicle.daoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        DaoImpl dao = new DaoImpl();
        dao.addVehicle();
    }
}