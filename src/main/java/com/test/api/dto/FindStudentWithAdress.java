package com.test.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public interface FindStudentWithAdress {
    @Value("#{target.name}")
    @JsonProperty("Student Name")
    public String getName();
    @Value("#{target.city}")
    @JsonProperty("City")
    public String getCity();
    @JsonProperty("State")
    @Value("#{target.state}")
    public String getState();

}
