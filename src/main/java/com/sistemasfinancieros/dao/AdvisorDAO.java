package com.sistemasfinancieros.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvisorDAO {
    // Simulating a database with a HashMap
    private Map<Integer, Advisor> database = new HashMap<>();
    private int currentId = 1;

    public List<Advisor> getAllAdvisors() {
        return new ArrayList<>(database.values());
    }

    public Advisor getAdvisorById(int id) {
        return database.get(id);
    }

    public Advisor createAdvisor(Advisor advisor) {
        advisor.setId(currentId++);
        database.put(advisor.getId(), advisor);
        return advisor;
    }

    public Advisor updateAdvisor(int id, Advisor advisor) {
        if (database.containsKey(id)) {
            advisor.setId(id);
            database.put(id, advisor);
            return advisor;
        }
        return null; // Advisor not found
    }

    public void deleteAdvisor(int id) {
        database.remove(id);
    }
}