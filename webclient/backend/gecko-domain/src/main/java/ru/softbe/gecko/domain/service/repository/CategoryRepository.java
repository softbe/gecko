package ru.softbe.gecko.domain.service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.softbe.gecko.domain.model.Category;
import ru.softbe.gecko.domain.service.extend.ExtendCategoryRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>, ExtendCategoryRepository {
}
