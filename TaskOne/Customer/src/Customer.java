public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    public Customer(String firstName, String lastName ,String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        this.id = counter;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;

    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public int getID(){
        return id;
    }
    @Override
    public String toString(){
        return "Customer ID: "+id+"\n" +
                "First name: "+firstName+"\n" +
                "Last name: "+lastName+"\n" +
                "Username: "+username+"\n"+"\n";
    }
}
