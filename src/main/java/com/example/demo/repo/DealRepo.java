package com.example.demo.repo;

import com.example.demo.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DealRepo extends JpaRepository<Deal, Long> {
    // no need to implement anything
}
