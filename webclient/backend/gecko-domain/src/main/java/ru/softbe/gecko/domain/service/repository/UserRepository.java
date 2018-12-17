package ru.softbe.gecko.domain.service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.softbe.gecko.domain.model.User;
import ru.softbe.gecko.domain.service.extend.ExtendUserRepository;

public interface UserRepository extends CrudRepository<User, Long>, ExtendUserRepository {
}
