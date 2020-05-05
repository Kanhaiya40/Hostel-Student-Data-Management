package com.test.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int studentId;
    @JsonProperty("Student Name")
    private String name;
    @JsonProperty("Admission Number")
    private String admNo;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("Address")
    private Address address;
    @ManyToOne
    private Hostel hostel;

}
