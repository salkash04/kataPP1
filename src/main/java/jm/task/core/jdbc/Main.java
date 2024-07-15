package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Arman", "Galoyan", (byte) 18);
        userService.saveUser("Ivan", "Petrov", (byte) 25);
        userService.saveUser("Maria", "Ivanova", (byte) 20);
        userService.saveUser("Bob", "Marley", (byte) 50);
        System.out.printf("Done");
//        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }

}

