package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Service

public class CarServiceImpl implements CarService {
    List<Car> carList;
    @Override
    public List<Car> returnCars(Integer count) {
        carList = getCarList();
        if (count == null || count >= 5) {
            return carList;
        } else if (count <= 0) {
            return new ArrayList<Car>();
        } else {
            return carList.stream().limit(count).toList();
        }
    }
    public static List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Dima", "Lada", "A111AA"));
        cars.add(new Car("Kolya", "BMW", "A222AA"));
        cars.add(new Car("Masha", "Mercedes", "A333AA"));
        cars.add(new Car("Petya", "Nissan", "A444AA"));
        cars.add(new Car("Nika", "Opel", "A555AA"));
        return cars;
    }
}