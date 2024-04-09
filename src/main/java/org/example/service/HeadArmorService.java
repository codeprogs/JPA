package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.BodyArmor;
import org.example.entity.HeadArmor;
import org.example.repository.HeadArmorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HeadArmorService {

    private final HeadArmorRepository headArmorRepository;

    @Transactional
    public void add(HeadArmor headArmor) {
        headArmorRepository.add(headArmor);
    }

    public Optional<HeadArmor> findById(UUID id) {
        return headArmorRepository.findById(id);
    }

}
