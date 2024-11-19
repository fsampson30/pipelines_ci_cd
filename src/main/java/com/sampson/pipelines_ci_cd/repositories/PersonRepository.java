package com.sampson.pipelines_ci_cd.repositories;

import com.sampson.pipelines_ci_cd.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
}
