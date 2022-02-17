package com.example.FinalProjectJavaAdvanced.repositories;

import com.example.FinalProjectJavaAdvanced.models.Authorities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepository extends CrudRepository<Authorities, Long> {

}
