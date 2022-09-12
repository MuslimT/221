package hiber.service;

import hiber.model.User;
import java.util.List;

    public interface UserService {
        void addUser(User user);
        List<User> listUsers();
        List<User> listUsersByCar(String model, int series);
    }