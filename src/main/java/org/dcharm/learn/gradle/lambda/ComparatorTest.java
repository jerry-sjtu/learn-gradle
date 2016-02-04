package org.dcharm.learn.gradle.lambda;

import org.dcharm.learn.gradle.lambda.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wangqiang on 2016/2/2.
 */
public class ComparatorTest {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.setAge(12);
        p2.setAge(34);
        p3.setAge(10);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("=== Sorted Asc SurName ===");
        System.out.println(personList);

        Collections.sort(personList, (Person x, Person y) -> y.getAge() - x.getAge());
        System.out.println("=== Sorted Asc SurName ===");
        System.out.println(personList);

        Collections.sort(personList, (x, y) -> x.getAge() - y.getAge());
        System.out.println("=== Sorted Desc SurName ===");
        System.out.println(personList);
    }
}
