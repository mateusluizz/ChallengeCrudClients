package com.devsuperior.dscrudclients.repositories;

import com.devsuperior.dscrudclients.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
