package com.rar.repository;

import com.rar.model.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {



 @Query(value="select distinct projectname from projects",nativeQuery = true)
 public List getProjectsList();

}
