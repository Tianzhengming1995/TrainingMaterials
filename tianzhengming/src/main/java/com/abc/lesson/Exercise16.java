package com.abc.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<EMP> list = new ArrayList<EMP>();
        list.add(new EMP("Terry", 25, "m", 6000));
        list.add(new EMP("Allen", 21, "f", 4000));
        list.add(new EMP("Smith", 23, "m", 3000));
        Collections.sort(list, new Comparator<EMP>() {
            public int compare(EMP o1, EMP o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        for (EMP e : list) {
            System.out.println(e.toString());
        }
    }
}

class EMP {
    private String name;
    private int age;
    private String gender;
    private int salary;

    public EMP(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
