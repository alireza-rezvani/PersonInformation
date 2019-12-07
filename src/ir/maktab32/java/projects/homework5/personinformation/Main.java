package ir.maktab32.java.projects.homework5.personinformation;

import ir.maktab32.java.projects.homework5.personinformation.model.Address;
import ir.maktab32.java.projects.homework5.personinformation.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {

        addPerson("Ali","AliAbadi",25,"Tehran",
                12,"Ferdowsi","Hafez","6578765564");
        addPerson("Ahmad","AhmadAbadi",30,"Tabriz",
                1,"Ahmadzadeh","Golha","7876565564");
        addPerson("Behnam","Rezayi",21,"Tehran",
                5,"Tajrish","Bahar","6556465787");
        addPerson("Mohammad","Mohammadi",35,"Shiraz",
                7,"Hafez","Sadi","8765566574");
        addPerson("Alireza","Asghari",28,"Tehran",
                2,"Ashrafi","Roz","5787656564");
        addPerson("Behzad","Hosseini",29,"Tehran",
                4,"TehranPars","Yas","5646578765");

        System.out.println("\u29bf List of People:");
        people.forEach(person -> System.out.println( person));

        System.out.println("\n\u29bf List of People Sorted by Age:");
        List<Person> peopleSortedByAge = people.stream()
                .sorted((Comparator.comparingInt(Person::getAge))).collect(Collectors.toList());
        peopleSortedByAge.forEach(person -> System.out.println(person));

        System.out.println("\n\u29bf List of Last Names of People Sorted by Length:");
        List<String> lastNamesSortedByLength = people.stream().map(person -> person.getLastName())
                .sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        lastNamesSortedByLength.forEach(s -> System.out.println("\t"+s));

        System.out.println("\n\u29bf List of People Living in Tehran, (Zone Fewer than 5):");
        List<Person> peopleInZoneLessenThan5 = people.stream()
                .filter(person -> person.getAddress().getCity().equals("Tehran"))
                .filter(person -> person.getAddress().getZone()<5).collect(Collectors.toList());
        peopleInZoneLessenThan5.forEach(person -> System.out.println(person));


    }

    public static void addPerson(String firstName, String lastName, int age,
                                   String city, int zone, String street, String alley, String postalCode){
        Address address = new Address(city, zone, street, alley, postalCode);
        people.add(new Person(firstName,lastName,age,address));

    }
}
