package kata1;

import java.util.Date;

/**
 *
 * @author Yousuf Boutahar
 * @version IS2, Primera practica
 * 
 */
public class Kata1 {


    public static void main(String[] args) {
        Person person = new Person("Pedro",new Date(98,2,24));
        System.out.println(person.getName() +" tiene " + 
                person.getAge() + " Años");
        
        
    }
    
}
