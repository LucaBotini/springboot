package br.com.devdojo.awesome.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public Student() {
    }
}
