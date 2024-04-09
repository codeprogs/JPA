package org.example.repository;

import lombok.RequiredArgsConstructor;
import org.example.entity.BodyArmor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;
import java.util.UUID;

@Repository
public class BodyArmorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void add(BodyArmor bodyArmor){
        entityManager.persist(bodyArmor);
    }

    public Optional<BodyArmor> findById(UUID id) {
        return Optional.ofNullable(entityManager.find(BodyArmor.class, id));
    }

}
