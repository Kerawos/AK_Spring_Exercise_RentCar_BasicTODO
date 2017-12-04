package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.models.OverallManagement2017;

/**
 * Service responsible for calculating car amortization
 */
@Service
public class CarAmortization {

    /**
     * Method calculating daily amortization based on car total value
     * @param carValue
     * @return daily amortization minimum of 10
     */
    public static int dailyAmortization(int carValue){
        //todo implement function
        return 10;
    }

    /**
     * Method calculating distance amortization based on listed params
     * @param carValue
     * @param passengerCapacity
     * @param fuelConsumption
     * @return distance amortization per 100 km
     */
    public static int distanceAmortization(int carValue, int passengerCapacity, int fuelConsumption){
        return carValue / ((OverallManagement2017.getCarExplorationCostEvery100km()) * ((passengerCapacity + fuelConsumption) * 25));
    }
}
