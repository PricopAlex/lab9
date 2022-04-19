package ro2;

import java.time.LocalDateTime;

public class PersonInfo {
    private Employee employee;
    public PersonInfo(Employee employee) {
        this.employee=employee;

    }
    public String getFullName(){
        return employee.firstName + " " + employee.lastName;
    }
    public int getAge() {
        int currentYear= LocalDateTime.now().getYear();
        int birthYear=employee.birthDay.getYear();
        return currentYear-birthYear;
    }
}
