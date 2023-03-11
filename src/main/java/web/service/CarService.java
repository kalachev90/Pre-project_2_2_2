package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private static List<Car> carList = new ArrayList<>(List.of(
            new Car("Mercedes", "S600", 2021),
            new Car("Audi", "A6", 2015),
            new Car("Lada", "Vesta", 2023),
            new Car("BMW", "X5", 2010),
            new Car("UAZ", "Patriot", 2018)
    )
    );

    public static List<Car> carsCount(Integer count) {
        if (count > 0 && count < carList.size()) {
            return carList.subList(0, count);
        }
        return carList;
    }
}
