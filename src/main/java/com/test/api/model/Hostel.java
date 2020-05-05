package com.test.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Hostel {
    @Id
    @GeneratedValue
    private int hostelId;
    @JsonProperty("Hostel Name")
    private String hostelName;
    @JsonProperty("Hostel No")
    private int hostelNo;
    @JsonProperty("No Of Students")
    private int noOfStudent;
    @OneToMany(targetEntity = Student.class ,cascade = CascadeType.ALL)
    @JsonProperty("Student")
    private List<Student> student;
}
