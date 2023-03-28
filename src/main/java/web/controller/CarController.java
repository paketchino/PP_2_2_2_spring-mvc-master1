package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    public CarController(@Autowired CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count", required = false, defaultValue = "0")
                                                        Integer count) {
        model.addAttribute("cars", carService.getAllCar());
        model.addAttribute("carsCount", carService.capacityCar(count));
        return "cars";
    }

}
