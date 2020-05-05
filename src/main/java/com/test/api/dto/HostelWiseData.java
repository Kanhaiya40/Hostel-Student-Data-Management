package com.test.api.dto;

import org.springframework.beans.factory.annotation.Value;

public interface HostelWiseData {
   // @Value("#{target.hostelName}")
     //String getHostelName();
    //@Value("#{target.hostelNo}")
    //Integer getHostelNo();
    @Value("#{target.name}")
    String getName();
    // public Integer getCount();
}
