package ru.softbe.gecko.domain.service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.softbe.gecko.domain.model.Camera;
import ru.softbe.gecko.domain.service.extend.ExtendCameraRepository;

public interface CameraRepository extends CrudRepository<Camera, Long>, ExtendCameraRepository {
}
