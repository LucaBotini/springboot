package br.com.devdojo.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
public class Student extends AbstactEntity{
    private String name;

}
