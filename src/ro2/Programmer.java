package ro2;

import java.time.LocalDateTime;

public class Programmer extends Employee{
    private String language;

    public Programmer(LocalDateTime dateOfEmployment, LocalDateTime birthDay, String position, String firstName,
                      String lastName, String address,String language) {
        super(dateOfEmployment, birthDay, position, firstName, lastName, address);
        this.language=language;
    }
    @Override
    public String getPosition(){
        return "Programmer";
    }
}
