package pl.asprojects.nosItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asprojects.nosItems.model.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

    public CategoryEntity getCategoryByName(String name);
}
