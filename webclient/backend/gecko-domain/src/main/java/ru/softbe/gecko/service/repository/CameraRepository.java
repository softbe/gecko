package ru.softbe.gecko.service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.softbe.gecko.model.Camera;
import ru.softbe.gecko.service.extend.ExtendCameraRepository;

public interface CameraRepository extends CrudRepository<Camera, Long>, ExtendCameraRepository {
}
