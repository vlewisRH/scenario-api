package com.consulting.scenarios.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="scenarios")
public class Scenario {
    
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(name = "description")
    private String desc;

    //Relationships

    @OneToMany(mappedBy = "scenario")
    private List<Step> steps;

    @ManyToMany(mappedBy = "scenarios")
    private List<Colleague> colleagues;


    //Getters and Setters

    public List<Step> getSteps() {
        return this.steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Colleague> getColleagues() {
        return this.colleagues;
    }

    public void setColleagues(List<Colleague> colleagues) {
        this.colleagues = colleagues;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //Constructors

    public Scenario() {
    }


}
