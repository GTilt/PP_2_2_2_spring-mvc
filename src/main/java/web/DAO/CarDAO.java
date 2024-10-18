package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> car;

    {
        car = new ArrayList<Car>();
        car.add(new Car("Mercedes-Benz", 24, "Black"));
        car.add(new Car("BMW", 23, "White"));
        car.add(new Car("Audi", 22, "Space-Black"));
        car.add(new Car("Lincoln Navigator", 21, "Red"));
        car.add(new Car("Tesla", 20, "Black"));
    }

    public List<Car> getCars() {
        return car;
    }

    public List<Car> showCountCars(int id) {
        List<Car> limitedCar = (car.size() > 5) ? car : car.stream().limit(id).toList();
        return limitedCar;
    }
}
