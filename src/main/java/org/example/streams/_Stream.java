package org.example.streams;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Imran", Gender.MALE),
                new Person("Sadia", Gender.FEMALE)

        );
        final Function<Person, Gender> personGenderFunction = person -> person.gender;
        Set<Gender>data = people.stream()
                .map(personGenderFunction)
                .collect(Collectors.toSet());
        System.out.println(data);
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
