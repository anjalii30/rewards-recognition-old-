package com.rar.repository;

import com.rar.model.Createreward;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreaterewardRepository extends CrudRepository<Createreward, Long> {

    @Query(value = "SELECT * FROM createreward WHERE award_status = 1",
            nativeQuery=true)
    List<Createreward> findByRolled();

    @Query(value = "SELECT * FROM createreward WHERE award_status = 2",
            nativeQuery=true)
    List<Createreward> findByNominationClosed();

    @Query(value = "SELECT * FROM createreward WHERE award_status = 3",
            nativeQuery=true)
    List<Createreward> findByDiscontinued();

    @Query(value="select * from nominations", nativeQuery = true)
    List getList();

}
