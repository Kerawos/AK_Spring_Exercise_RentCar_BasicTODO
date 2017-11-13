package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models;

import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.bags.CarModel;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.bags.UserPreferencesModel;

import java.util.List;

public class OptimalCarFounder {

    private List<CarModel> listOfPotentialCarsToRent;
    private int potentialLeftMoney;
    private int potentialTotalDailyCost;
    private int potentialDistanceCost;


    public List<CarModel> optimalCarsToRent(UserPreferencesModel userPreferencesModel){
        listOfPotentialCarsToRent = CarGarage.getAvailableModels();
        for (int i = 0; i < listOfPotentialCarsToRent.size(); i++) {
            //1. check passenger capacity
            if (userPreferencesModel.getPassengerCapacity() > listOfPotentialCarsToRent.get(i).getPassengerCapacity()){
                listOfPotentialCarsToRent.remove(i);
                i--;
                continue;
            } else { //2. check if user have money for daily and distance car
                //todo implement method part, calculate: potentialDistanceCost, potentialTotalDailyCost and potentialLeftMoney
                potentialDistanceCost = 10;
                potentialTotalDailyCost = 10;
                potentialLeftMoney = 10;
                if (potentialLeftMoney<0){
                    listOfPotentialCarsToRent.remove(i);
                    i--;
                    continue;
                }
            }
        }

        return listOfPotentialCarsToRent;
    }


}
