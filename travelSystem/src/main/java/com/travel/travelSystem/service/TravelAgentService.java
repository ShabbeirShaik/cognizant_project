package com.travel.travelSystem.service;

import com.travel.travelSystem.model.TravelAgent;

import java.util.List;

public interface TravelAgentService {
    public TravelAgent saveTravelAgent(TravelAgent travelAgent);
    public List<TravelAgent> getAllTravelAgents();

}
