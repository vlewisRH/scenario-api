package com.consulting.scenarios.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="steps")
public class Step {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name="scenario_id")
    private Scenario scenario;

    @OneToMany(mappedBy = "parentStep")
    private List<Option> options;

    @OneToOne(mappedBy = "step")
    private Communication communication;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "next_step",
      joinColumns = 
      { @JoinColumn(name = "step_id", referencedColumnName = "id") },
      inverseJoinColumns = 
      { @JoinColumn(name = "nextStep_id")})
    private Step nextStep;

    @ManyToMany
    @JoinTable( name="Step_Prerequisit",
        joinColumns={@JoinColumn(name="Step_Id")},
        inverseJoinColumns={@JoinColumn(name="Prereq_id")})    
    private List<Step> prereqs;


    public Step() {
    }

    public Step(int id, Scenario scenario, List<Option> options, Communication comms, List<Step> prereqs) {
        this.id = id;
        this.scenario = scenario;
        this.options = options;
        this.communication = comms;
        this.prereqs = prereqs;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scenario getScenario() {
        return this.scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public List<Option> getOptions() {
        return this.options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Communication getComms() {
        return this.communication;
    }

    public void setComms(Communication comms) {
        this.communication = comms;
    }

    public List<Step> getPrereqs() {
        return this.prereqs;
    }

    public void setPrereqs(List<Step> prereqs) {
        this.prereqs = prereqs;
    }

}
