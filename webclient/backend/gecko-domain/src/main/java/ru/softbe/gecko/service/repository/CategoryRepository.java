package ru.softbe.gecko.service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.softbe.gecko.model.Category;
import ru.softbe.gecko.service.extend.ExtendCategoryRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>, ExtendCategoryRepository {
}
