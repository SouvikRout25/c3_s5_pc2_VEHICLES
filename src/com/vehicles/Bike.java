package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle{
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("sportsBike")){
            return 300;
        } else if (vehicleType.equalsIgnoreCase("cruiser")) {
            return 170;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer Name :" + getVehicleName()+",Model Name :"+ getVehicleModelName()+",Type :"+getVehicleType()+"}";
    }
}
