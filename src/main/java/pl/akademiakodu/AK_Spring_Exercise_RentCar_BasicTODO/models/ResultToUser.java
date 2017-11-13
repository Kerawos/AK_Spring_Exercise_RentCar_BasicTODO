package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models;

import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.bags.CarModel;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.bags.ResultModel;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.bags.UserPreferencesModel;

import java.util.List;

public class ResultToUser {

    private List<ResultModel> resultList;
    private int potentialTotalDailyCost;
    private int potentialDistanceCost;
    private CostCalculator costCalculator;

    public List<ResultModel> generateResults(List<CarModel> potentialCarsToRent, UserPreferencesModel userPreferencesModel){
        //todo implement first part of method

        for (int i = 0; i < potentialCarsToRent.size(); i++) {
            potentialDistanceCost = costCalculator.totalDistanceCost(userPreferencesModel.getProximalDistance(),
                    potentialCarsToRent.get(i).getCostPer100Km(), potentialCarsToRent.get(i).getFuelConsumption());
            potentialTotalDailyCost = costCalculator.dailyTotalRentCost(userPreferencesModel.getRentDuration(),
                    potentialCarsToRent.get(i).getDailyCost());
            resultList.add(new ResultModel(potentialCarsToRent.get(i), (potentialDistanceCost +
                    potentialTotalDailyCost), potentialCarsToRent.get(i).getDailyCost(), potentialCarsToRent.get(i).getCostPer100Km()));
        }

        //todo implement second part of the method

        return null;
    }

}
