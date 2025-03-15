package ca.ulaval.glo2003.customer.infra;

import ca.ulaval.glo2003.customer.logic.Customer;
import ca.ulaval.glo2003.customer.logic.CustomerPersistence;
import dev.morphia.Datastore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

public class CustomerPersistenceMongo implements CustomerPersistence {
    private final Datastore datastore;

    public CustomerPersistenceMongo(Datastore datastore) {
        this.datastore = datastore;
    }

    @Override
    public List<Customer> listAll() {
        throw new RuntimeException("Not yet implemented");
    }

    @Override
    public void save(Customer customer) {
        throw new RuntimeException("Not yet implemented");
    }
}
