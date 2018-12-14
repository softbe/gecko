package ru.softbe.gecko.service.extend.impl;

import ru.softbe.gecko.service.extend.ExtendCameraRepository;

public class ExtendCameraRepositoryImpl implements ExtendCameraRepository {
    @Override
    public String getCameraName(Long id) {
        return "name";
    }
}
