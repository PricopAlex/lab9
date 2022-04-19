package ro2;

import java.time.LocalDateTime;

public interface Person {
    String getFirstName();
    String getLastName();
    LocalDateTime getBirthDay();
    String getAddress();
}
