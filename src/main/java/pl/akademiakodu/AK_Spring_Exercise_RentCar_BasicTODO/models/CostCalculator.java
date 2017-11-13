package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models;

public class CostCalculator {

    public int dailyTotalRentCost(int userDailyRentTime, int carDailyRentTime){
        return userDailyRentTime * carDailyRentTime;
    }

    public int carAmortizationPer100Km(int proximalDistance, int carCostPer100Km){
        //todo implement method
        return 120;
    }

    public int costOfFuelConsumption(int proximalDistance, int carFuelConsumption){
        return ((carFuelConsumption * proximalDistance) / 100) * OverallManagement2017.getCostOfOneFuel() > 200 ?
                200 : ((carFuelConsumption * proximalDistance) / 100) * OverallManagement2017.getCostOfOneFuel();
    }

    public int totalDistanceCost(int proximalDistance, int carCostPer100Km, int carFuelConsumption){
        return carAmortizationPer100Km(proximalDistance, carCostPer100Km) + costOfFuelConsumption(proximalDistance, carFuelConsumption);
    }

    public int totalPodentialCost(int potentialTotalDistanceCost, int potentialTotalDailyCost){
        return potentialTotalDistanceCost + potentialTotalDailyCost;
    }



}
