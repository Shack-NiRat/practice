package ru.neoflex.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "results")
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String result;

    public Base(){

    }

    public Base(String result){
        this.result = result;
    }
    @Column(name = "results", nullable = false)
    public String getResult(){
        return result;
    }

    public void SetResult(String result){
        this.result = result;
    }

}
