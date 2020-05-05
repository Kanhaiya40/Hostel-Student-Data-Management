package com.test.api.dao;

import com.test.api.dto.FindStudentWithAdress;
import com.test.api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query(value="select  state,name,city from student join address on address_add_id=add_id where state=?1",nativeQuery=true)
    List<FindStudentWithAdress> getInfo(String state);
}
