package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models;

public class CarAmortization {

    public static int dailyAmortization(int carValue){
        //todo implement function
        return 10;
    }

    public static int distanceAmortization(int carValue, int passengerCapacity, int fuelConsumption){
        return carValue / ((OverallManagement2017.getCarExplorationCostEvery100km()) * ((passengerCapacity + fuelConsumption) * 25));
    }
}
