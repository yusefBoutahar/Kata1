package kata1;

import java.time.LocalDate;
/**
 *
 * @author Yousuf Boutahar
 * @version IS2, Primera practica
 * 
 */
public class Kata1 {


    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(1998, 3, 31);
        
        Person person = new Person("Pedro",date);
        System.out.println(person.getName() +" tiene " + 
                person.getAge() + " Años");
        
        
    }
    
}
