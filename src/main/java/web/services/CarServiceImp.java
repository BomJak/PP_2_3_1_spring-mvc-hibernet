package web.services;

import org.springframework.stereotype.Service;
import web.models.Cars;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Cars> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Cars(1, "Volga", "2410"));
        cars.add(new Cars(2, "Volvo", "1205"));
        cars.add(new Cars(3, "Golga", "0625"));
        cars.add(new Cars(4, "Gulag", "03175"));
        cars.add(new Cars(5, "Laggu", "1508"));
    }

    @Override
    public List<Cars> getByNumber(int num) {
        List<Cars> carsList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            carsList.add(cars.get(i));
        }

        return carsList;
    }

    @Override
    public List<Cars> getAllCars() {
        List<Cars> c = new ArrayList<Cars>();
        return cars;
    }
}
