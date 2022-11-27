package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> returnCars();

    List<Car> returnCarsByCount(int count);
}
