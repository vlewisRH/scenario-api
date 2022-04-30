package com.consulting.scenarios.models;

import javax.persistence.*;

@Entity
@Table(name="communications")
public class Communication {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "comm_type")
    private String commType;

    @Column(name = "message")
    private String message;

    @Column(name = "sender")
    private Colleague sender;

    @ManyToOne
    @JoinColumn(name="step_id")
    private Step step;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommType() {
        return this.commType;
    }

    public void setCommType(String commType) {
        this.commType = commType;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Colleague getSender() {
        return this.sender;
    }

    public void setSender(Colleague sender) {
        this.sender = sender;
    }



    
}
