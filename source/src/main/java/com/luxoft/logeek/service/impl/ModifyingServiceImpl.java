package com.luxoft.logeek.service.impl;

import com.luxoft.logeek.entity.EntityWithManyStringFields;
import com.luxoft.logeek.service.ModifyingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Component
@Transactional
@RequiredArgsConstructor
public class ModifyingServiceImpl implements ModifyingService {
    private final EntityManager em;

    @Override
    public void saveEntity(EntityWithManyStringFields entity) {
        em.persist(entity);
        em.flush();
    }
}
