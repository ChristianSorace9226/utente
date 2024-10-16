package it.nesea.utente.service.impl;

import it.nesea.utente.model.entity.User;
import it.nesea.utente.model.repository.UserRepository;
import it.nesea.utente.service.UserServiceResource;

public class UserService implements UserServiceResource {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
