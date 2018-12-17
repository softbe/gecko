package ru.softbe.gecko.domain.service.extend.impl;

import org.springframework.stereotype.Service;
import ru.softbe.gecko.domain.model.Camera;
import ru.softbe.gecko.domain.service.extend.ExtendCameraRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class ExtendCameraRepositoryImpl implements ExtendCameraRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public String getCameraName(Long id) {
        Camera camera = entityManager.find(Camera.class, id);
        return camera.getName();
    }
}
