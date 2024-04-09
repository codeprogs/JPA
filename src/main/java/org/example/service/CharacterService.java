package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Character;
import org.example.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    @Transactional
    public void add (Character character) {
        characterRepository.add(character);
    }

    @Transactional
    public void update (Character character) {
        characterRepository.update(character);
    }

    @Transactional
    public List<Character> findAll(){
        return characterRepository.findAll();
    }

    @Transactional
    public Optional<Character> findCharacterById(UUID id){
        return characterRepository.findCharacterById(id);
    }

    @Transactional
    public void delete(UUID id){
        Optional<Character> character = findCharacterById(id);
        character.ifPresent(characterRepository::delete);
    }
}
