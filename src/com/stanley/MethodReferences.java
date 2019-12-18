package com.stanley;

import com.stanley.modelandentity.Person;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        Person stanley = new Person("Stanley", 31);

        //we can use method references using ->
        Function<Person, Integer> calculateYearOfBirth = person -> 2019 - person.getAge();

        // Or the shorter way using just ::
        Function<Person, String> nameOfPerson = Person::getName;

        System.out.println(calculateYearOfBirth.apply(stanley));
        System.out.println(nameOfPerson.apply(stanley));

        //Second example
        //Fistly, It's the lambda way:
        BinaryOperator<Integer> sumLambda = (s1, s2) -> Integer.sum(s1, s2);

        //And the method reference way:
        BinaryOperator<Integer> sumMethodReference = Integer::sum;

        System.out.print(sumLambda.apply(10, 20) + " vs " + sumMethodReference.apply(10, 20));

    }
}
