package com.luxoft.logeek.repository;

import com.luxoft.logeek.entity.association.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
