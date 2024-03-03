package com.hexaware.springrestprac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.springrestprac.entity.Assets;

public interface AssetsRepository extends JpaRepository<Assets, Integer> {

}
