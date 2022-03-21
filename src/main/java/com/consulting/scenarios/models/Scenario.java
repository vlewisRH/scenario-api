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
    private String name;

    public Scenario() {
    }

}
