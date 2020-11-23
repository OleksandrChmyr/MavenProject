package lesson14;

import lesson14.entities.Customer;
import lesson14.services.CustomerServices;

import java.util.List;

public class Main {

    CustomerServices customerServices = new CustomerServices();
    List<Customer> all = customerServices.getAll();
//    for (int i = 0 )
//    all.forEach(sout)
}
