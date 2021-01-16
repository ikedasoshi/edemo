package com.etest.edemo.controller.repositories;

import com.etest.edemo.controller.MyData;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDataRepository extends JpaRepository<MyData, Long> {
    public Optional<MyData> findById(Long name);
}