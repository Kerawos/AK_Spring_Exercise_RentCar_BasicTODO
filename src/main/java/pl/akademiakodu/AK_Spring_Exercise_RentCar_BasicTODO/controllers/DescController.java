package pl.akademiakodu.AK_Spring_Exercise_RentCar_BasicTODO.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DescController {

    @GetMapping("/desc")
    public String descGet(){
        return "desc";
    }
}
