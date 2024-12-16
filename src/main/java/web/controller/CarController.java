package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService cS) {
        this.carService = cS;
    }

    @GetMapping(value = "/cars")
    public String outCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null && count > 0 && count <= 5) {
            model.addAttribute("cars", carService.getByNumber(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }
}
