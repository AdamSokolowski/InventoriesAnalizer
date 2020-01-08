package pl.asprojects.nosItems.mapper;

import org.springframework.stereotype.Component;
import pl.asprojects.nosItems.dto.CategoryDto;
import pl.asprojects.nosItems.dto.NewCategoryDto;
import pl.asprojects.nosItems.model.CategoryEntity;

@Component
public class CategoryMapper {

    public CategoryDto entityToDto(CategoryEntity categoryEntity) {
        return new CategoryDto(categoryEntity.getId(), categoryEntity.getName());
    }

    public NewCategoryDto newCategoryDto(CategoryEntity categoryEntity) {
        return new NewCategoryDto(categoryEntity.getName());
    }

    public CategoryEntity dtoToEntity(CategoryDto categoryDto) {
        return new CategoryEntity(categoryDto.getId(), categoryDto.getName());
    }

    public CategoryEntity dtoToNewEntity(NewCategoryDto newCategoryDto) {
        return new CategoryEntity(0, newCategoryDto.getName());
    }
}
