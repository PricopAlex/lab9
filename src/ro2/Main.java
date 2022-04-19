package ro2;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime birthDay=LocalDateTime.parse("1944-04-03T12:39:10");
        LocalDateTime dateOfEmployment=LocalDateTime.parse("1999-08-03T12:39:10");
        DatabaseAdmin databaseAdmin=new DatabaseAdmin(dateOfEmployment,birthDay,"programmer","dsadas",
                "sdadawea","efea","mysql");
        PersonInfo personInfo=new PersonInfo(databaseAdmin);
        System.out.println("the full name of this person is: "+ personInfo.getFullName());
        System.out.println("this person is "+ personInfo.getAge() +" years old");
    }
}
