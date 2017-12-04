package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.CarGarage;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.CarModel;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.UserPreferencesModel;

import java.util.List;

/**
 * Service responsible for calculating optimal car to rent
 */
@Service
public class OptimalCarFounder {

    /**
     * Variables and services declarations
     */
    private List<CarModel> listOfPotentialCarsToRent;
    private int potentialLeftMoney;
    private int potentialTotalDailyCost;
    private int potentialDistanceCost;
    private CostCalculator costCalculator;
    private CarGarage carGarage;


    /**
     * Method calculating potential car to rent based on user inputs
     * @param userPreferencesModel stored user inputs
     * @return list of potential cars to rent
     */
    public List<CarModel> optimalCarsToRent(UserPreferencesModel userPreferencesModel){
        carGarage = new CarGarage();
        listOfPotentialCarsToRent = carGarage.getAvailableModels();
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
