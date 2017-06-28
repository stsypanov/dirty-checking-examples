package com.luxoft.logeek.repository;

import com.luxoft.logeek.entity.Parent;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ParentRepository extends JpaRepository<Parent, Long> {

    @EntityGraph(value = Parent.CHILDREN, type = EntityGraph.EntityGraphType.LOAD)
    @Query("select p from Parent p where p.id = :id")
    Parent findOneFetchingChildren(@Param("id") Long id);
}
