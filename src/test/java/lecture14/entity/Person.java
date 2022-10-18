package lecture14.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    String firstName;
    String lastName;
    String address;
    Integer age;
    String sex;
    String id;
}
