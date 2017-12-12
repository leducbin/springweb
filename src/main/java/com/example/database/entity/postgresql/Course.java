package com.example.database.entity.postgresql;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "course")
public class Course implements Serializable {

    private static final long serialVersionUID = -9019470250770543773L;

    @Id
    private Long id;
    @Column
    private String fisrtname;
    @Column
    private String lastname;

    public Course(Long id, String fisrtname, String lastname) {
        super();
        this.id = id;
        this.fisrtname = fisrtname;
        this.lastname = lastname;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        this.fisrtname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
