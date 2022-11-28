package com.travel.travelSystem.controller;

import com.travel.travelSystem.model.TravelAgent;
import com.travel.travelSystem.service.TravelAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/travelAgent")
@CrossOrigin
public class TravelAgentController {
    @Autowired
    private TravelAgentService travelAgentService;
    @PostMapping("/add")
    public String add(@RequestBody TravelAgent travelAgent){
        travelAgentService.saveTravelAgent(travelAgent);
        return "New student is added";
    }
    @GetMapping("/getAll")
    public List<TravelAgent> getAllTravelAgents(){
        return travelAgentService.getAllTravelAgents();
    }
}
