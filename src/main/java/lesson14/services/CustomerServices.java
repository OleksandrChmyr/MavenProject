package lesson14.services;

import lesson14.entities.Customer;
import lesson14.utils.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerServices {
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            connection.setAutoCommit(false);
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setEmail(resultSet.getString("email"));
                customer.setName(resultSet.getString("name"));
                customer.setAge(resultSet.getInt("age"));
                customers.add(customer);
            }
            connection.commit();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return customers;
    }
}
