package ru.softbe.gecko.service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.softbe.gecko.model.User;
import ru.softbe.gecko.service.extend.ExtendUserRepository;

public interface UserRepository extends CrudRepository<User, Long>, ExtendUserRepository {
}
