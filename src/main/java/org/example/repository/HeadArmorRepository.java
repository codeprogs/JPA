package org.example.repository;

import org.example.entity.BodyArmor;
import org.example.entity.HeadArmor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;
import java.util.UUID;

@Repository
public class HeadArmorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void add(HeadArmor headArmor){
        entityManager.persist(headArmor);
    }

    public Optional<HeadArmor> findById(UUID id) {
        return Optional.ofNullable(entityManager.find(HeadArmor.class, id));
    }
}
