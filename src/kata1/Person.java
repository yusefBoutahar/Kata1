package kata1;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Yousuf Boutahar
 * @version IS2, Primera practica
 * 
 */
public class Person {
    
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge(){
        return (Period.between(birthdate, LocalDate.now())).getYears();
    }
}
