package com.test.api.controller;

import com.test.api.dto.FindStudentWithAdress;
import com.test.api.dto.HostelWiseData;
import com.test.api.model.Hostel;
import com.test.api.service.HostelServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HostelControllerClass {
    @Autowired
    private HostelServiceClass serviceClass;
    @PostMapping("addDetails")
    public String saveDetails(@RequestBody Hostel hostel)
    {
        serviceClass.addDetails(hostel);
        return "Data Added To Database";
    }
    @GetMapping("getDetails")
    public List<Hostel> getDetails()
    {
        return serviceClass.getAllDetails();
    }
    @PutMapping("updateDetails/{id}")
    public String updateHostelDetails(@RequestBody Hostel hostel,@PathVariable int id)
    {
        serviceClass.updateDetails(hostel,id);
        return "Details Updated";
    }
    @DeleteMapping("deleteDetails/{id}")
    public String deleteDetails(@PathVariable int id)
    {
        serviceClass.deleteHostelDetails(id);
        return "Details Deleted";
    }
    @GetMapping("/getinfo/{state}")
    public List<FindStudentWithAdress> getStudentWithAddress(@PathVariable String state)
    {
        return serviceClass.getCustomInfo(state);
    }
    @GetMapping("getData")
    public List<HostelWiseData> getHostelData()
    {
        return serviceClass.getAllHostelWiseData();
    }
    @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        serviceClass.deleteStudentById(id);
        return "Student Deleted";
    }
}
