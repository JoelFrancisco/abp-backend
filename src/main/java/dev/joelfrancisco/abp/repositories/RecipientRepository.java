package dev.joelfrancisco.abp.repositories;

import dev.joelfrancisco.abp.entities.Recipient;
import dev.joelfrancisco.abp.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecipientRepository extends CrudRepository<Recipient, UUID> {
}
