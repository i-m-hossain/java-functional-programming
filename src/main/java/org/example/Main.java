package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Person> people = List.of(
               new Person("Imran", Gender.MALE),
               new Person("Sadia", Gender.FEMALE),
               new Person("Akash", Gender.MALE)
       );
        //imperative approach
        List<Person> females  = new ArrayList<>();
        for (Person person: people) {
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for(Person female: females){
            System.out.println(female);
        }
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2) );
    }
    static class Person{
        private final String name;
        private final Gender gender;
        Person(String name, Gender gender){
            this.name = name;
            this.gender= gender;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

    }
    enum Gender{
        MALE, FEMALE
    }
}