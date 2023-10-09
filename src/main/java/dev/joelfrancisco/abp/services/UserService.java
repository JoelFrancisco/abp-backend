package dev.joelfrancisco.abp.services;


import dev.joelfrancisco.abp.entities.Recipient;
import dev.joelfrancisco.abp.entities.User;
import dev.joelfrancisco.abp.exceptions.EntityNotFoundException;
import dev.joelfrancisco.abp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void save(User user) {
        // validação AQUI
        repository.save(user);
    }

    public Iterable<User> findAll() {
        // validação AQUI
        return repository.findAll();
    }

    public Optional<User> findById(UUID id) {
        // validação AQUI
        return repository.findById(id);
    }

    public void update(User user) throws EntityNotFoundException {
        if (repository.existsById(user.getId())) {
            repository.save(user);
        } else {
            throw new EntityNotFoundException(user);
        }
    }

    public void removeById(UUID id) {
        // validação AQUI
        repository.deleteById(id);
    }
}
