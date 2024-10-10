import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer customer1 = new Customer("Caroline", "Marslev","carolo");
        customers.add(customer1);

        Customer customer2 = new Customer("Noah", "Torp","Noass");
        customers.add(customer2);

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c: customers){
            System.out.print(c);
        }

    }
}
