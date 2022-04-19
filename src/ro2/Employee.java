package ro2;

import java.time.LocalDateTime;

public class Employee implements Person{
        protected LocalDateTime dateOfEmployment,birthDay;
        protected String position,firstName,lastName,address;

        public Employee(LocalDateTime dateOfEmployment, LocalDateTime birthDay, String position,
                        String firstName, String lastName, String address) {
                this.dateOfEmployment = dateOfEmployment;
                this.birthDay = birthDay;
                this.position = position;
                this.firstName = firstName;
                this.lastName = lastName;
                this.address = address;
        }

        @Override
        public String getFirstName() {
                return firstName;
        }

        @Override
        public String getLastName() {
                return lastName;
        }

        @Override
        public LocalDateTime getBirthDay() {
                return birthDay;
        }

        @Override
        public String getAddress() {
                return address;
        }
        public String getPosition(){
                return position;
        }
}
