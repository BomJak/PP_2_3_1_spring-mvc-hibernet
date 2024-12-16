package web.services;
import web.models.Cars;

import java.util.List;

public interface CarService {
    public List<Cars> getByNumber(int num);
    public List<Cars> getAllCars();
}
