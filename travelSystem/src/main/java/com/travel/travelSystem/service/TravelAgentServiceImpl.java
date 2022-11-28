package com.travel.travelSystem.service;
import com.travel.travelSystem.model.TravelAgent;
import com.travel.travelSystem.repository.TravelAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TravelAgentServiceImpl implements TravelAgentService{
    @Autowired
    private TravelAgentRepository travelAgentRepository;
    @Override
    public TravelAgent saveTravelAgent(TravelAgent travelAgent) {
        return travelAgentRepository.save(travelAgent);
    }

    @Override
    public List<TravelAgent> getAllTravelAgents() {
        return travelAgentRepository.findAll();
    }

}
