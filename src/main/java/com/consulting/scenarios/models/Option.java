package com.consulting.scenarios.models;

import javax.persistence.*;

@Entity
@Table(name="options")
public class Option {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name="options")
    private Step parentStep;

    @Column(name="option_text")
    private String optText;


    public Option() {
    }

    public Option(int id, Step parentStep, Step nextStep, String optText) {
        this.id = id;
        this.parentStep = parentStep;
        this.optText = optText;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Step getParentStep() {
        return this.parentStep;
    }

    public void setParentStep(Step parentStep) {
        this.parentStep = parentStep;
    }

    public String getOptText() {
        return this.optText;
    }

    public void setOptText(String optText) {
        this.optText = optText;
    }

}
