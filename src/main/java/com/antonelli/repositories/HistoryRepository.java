package com.antonelli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antonelli.entities.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long>{

}
