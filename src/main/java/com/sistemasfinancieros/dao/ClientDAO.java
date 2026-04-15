package com.sistemasfinancieros.dao;

import java.util.List;

public class ClientDAO {

    // Assume we have a List<Client> clients to act as our database
    private List<Client> clients;

    public List<Client> getAllClients() {
        return clients;
    }

    public Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null; // Return null if not found
    }

    public void createClient(Client client) {
        clients.add(client);
    }

    public void updateClient(int id, Client updatedClient) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.getId() == id) {
                clients.set(i, updatedClient);
                return;
            }
        }
    }

    public void deleteClient(int id) {
        clients.removeIf(client -> client.getId() == id);
    }
}