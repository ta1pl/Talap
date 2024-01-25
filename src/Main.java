import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Student("Talap", "russian", 1.67));
        persons.add(new Employer("MArik", "aristan", "starosta", 75000));
        persons.add(new Student("Ruslan", "doter", 2));
        persons.add(new Employer("Nariman", "Chess", "Carlsen", 105000));

        for (int i = 0; i < 4; i++){
            persons.get(i).getPaymentAmount();
        }

        Collections.sort(persons);

        printData(persons);
    }
    public static void printData(Iterable<Person> persons){
        for (Person person : persons){
            System.out.println(person.ToString() + " " + person.getPaymentAmount());
        }
    }
}