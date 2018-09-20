package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Yousuf Boutahar
 * @version IS2, Primera practica
 * 
 */
public class Person {
    
    private final String name;
    private final Calendar birthdate;
    private final long MILISECODS_PER_YEAR = (long)(1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public long getMiliecondsPerYear (){
        return MILISECODS_PER_YEAR;
    }
    

    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (this.milisecondsToYear(
                today.getTimeInMillis()- this.getBirthdate().getTimeInMillis())); 
    }
    
    private long milisecondsToYear(long milles){
        return milles / this.getMiliecondsPerYear();
        
    }
}
