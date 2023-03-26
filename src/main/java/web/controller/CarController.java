package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count", required = false)
                                                        Integer count) {
        if (count == null || count <= 0) {
            count = carService.getAllCar().size();
        }
        model.addAttribute("cars", carService.getAllCar());
        model.addAttribute("carsCount", carService.capacityCar(count));
        return "cars";
    }

}
