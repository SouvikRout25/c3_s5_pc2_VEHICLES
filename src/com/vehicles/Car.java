package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("SportsCar")){
            return 250;
        }
        else if(vehicleType.equalsIgnoreCase("Sedan")){
            return 190;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Car{Manufacturer Name :" + getVehicleName()+",Model Name :"+ getVehicleModelName()+",Type :"+getVehicleType()+"}";
    }
}
