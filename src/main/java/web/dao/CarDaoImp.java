package web.dao;


import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> cars = Arrays.asList(
            new Car("jigul", 1581, 1999),
            new Car("panamero", 1933, 2933),
            new Car("beemve", 2212, 2321),
            new Car("ford", 2221, 1985),
            new Car("komarro", 2312, 1993)
    );

    @Override
    public List<Car> returnCars() {
        return cars;
    }

    public List<Car> returnCarsByCount(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

}
