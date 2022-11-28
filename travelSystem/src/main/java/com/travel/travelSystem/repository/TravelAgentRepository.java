package com.travel.travelSystem.repository;

import com.travel.travelSystem.model.TravelAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelAgentRepository extends JpaRepository<TravelAgent, Integer>{
}