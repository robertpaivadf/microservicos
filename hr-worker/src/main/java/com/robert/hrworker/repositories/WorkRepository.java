package com.robert.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robert.hrworker.entities.Worker;

public interface WorkRepository extends JpaRepository<Worker, Long>{
}
