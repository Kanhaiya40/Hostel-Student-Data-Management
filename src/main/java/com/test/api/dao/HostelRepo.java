package com.test.api.dao;

import com.test.api.dto.HostelWiseData;
import com.test.api.model.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HostelRepo extends JpaRepository<Hostel,Integer> {
    @Query(value="select name from hostel natural join student  where hostel_name='Tipu Sultan'",nativeQuery=true)
    List<HostelWiseData> getAllData();
}
