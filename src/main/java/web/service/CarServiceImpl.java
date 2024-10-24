package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> showCountCars(int id) {
        return (id > 0) ? carDao.getCars().stream().limit(id).toList() : carDao.getCars();
    }
}
