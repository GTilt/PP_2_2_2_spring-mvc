package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car("Mercedes-Benz", 24, "Black"));
        car.add(new Car("BMW", 23, "White"));
        car.add(new Car("Audi", 22, "Space-Black"));
        car.add(new Car("Lincoln Navigator", 21, "Red"));
        car.add(new Car("Tesla", 20, "Black"));
    }

    @Override
    public List<Car> getCars() {
        return car;
    }

}
