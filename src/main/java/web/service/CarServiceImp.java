package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{


    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> returnCars(int count) {
        if (count > 5) {
            return carDao.returnCars();
        }
        return carDao.returnCarsByCount(count);
    }
}
