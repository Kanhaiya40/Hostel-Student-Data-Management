package com.test.api.service;

import com.test.api.dao.HostelRepo;
import com.test.api.dao.StudentRepo;
import com.test.api.dto.FindStudentWithAdress;
import com.test.api.dto.HostelWiseData;
import com.test.api.model.Hostel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class HostelServiceClass {
    @Autowired
    private HostelRepo repo;
    @Autowired
    private StudentRepo repo1;
    public Hostel addDetails(Hostel hostel)
    {
        return repo.save(hostel);
    }
    public List<Hostel> getAllDetails()
    {
        return repo.findAll();
    }
    public Hostel updateDetails(Hostel hostel,int id)
    {
        hostel.setHostelId(id);
        return repo.save(hostel);
    }
    public void deleteHostelDetails(int id)
    {
         repo.deleteById(id);
    }
    public List<FindStudentWithAdress> getCustomInfo(String state)
    {
        return repo1.getInfo(state);
    }
    public List<HostelWiseData> getAllHostelWiseData() { return repo.getAllData(); }
    public void deleteStudentById(int id)
    {
        repo1.deleteById(id);
    }
}
