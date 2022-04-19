package ro2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(LocalDateTime dateOfEmployment, LocalDateTime birthDay, String position, String firstName,
                         String lastName, String address,String dbTechnology) {
        super(dateOfEmployment, birthDay, position, firstName, lastName, address);
        this.dbTechnology = dbTechnology;
    }
    @Override
    public String getAddress(){
        return "db admin " + address;
    }

}
