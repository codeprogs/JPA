package org.example.repository;

import org.example.entity.Character;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CharacterRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Character character){
        entityManager.persist(character);
    }

    public void update(Character character){
        entityManager.merge(character);
    }

    public List<Character> findAll(){
        String jpql = "FROM Character";
        TypedQuery<Character> query = entityManager.createQuery(jpql, Character.class);
        return query.getResultList();
    }

    public Optional<Character> findCharacterById(UUID id) {
        return Optional.ofNullable(entityManager.find(Character.class, id));
    }

    public void delete(Character character){
        entityManager.remove(character);
    }
}
