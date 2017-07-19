package com.luxoft.logeek.repository;

import com.luxoft.logeek.entity.association.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
