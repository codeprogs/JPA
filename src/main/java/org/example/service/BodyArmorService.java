package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.BodyArmor;
import org.example.repository.BodyArmorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BodyArmorService {

    private final BodyArmorRepository bodyArmorRepository;

    @Transactional
    public void add(BodyArmor bodyArmor) {
        bodyArmorRepository.add(bodyArmor);
    }

    public Optional<BodyArmor> findById(UUID id) {
        return bodyArmorRepository.findById(id);
    }

}
