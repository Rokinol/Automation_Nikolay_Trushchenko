package lecture14;

import lecture14.entity.Person;
import org.testng.annotations.Test;

public class Lecture14_Test {

    @Test
    public void person_Test() {
        Person person = new Person() {{
                setAddress("Kek");
                setFirstName("Lol");
                setLastName("Lul");
            }};
        System.out.println(person);
        }
    }
