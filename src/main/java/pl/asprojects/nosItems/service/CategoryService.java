package pl.asprojects.nosItems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.asprojects.nosItems.dto.NewCategoryDto;
import pl.asprojects.nosItems.mapper.CategoryMapper;
import pl.asprojects.nosItems.model.CategoryEntity;
import pl.asprojects.nosItems.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    public CategoryEntity getCategoryById(int categoryId) {
        return categoryRepository.getOne(categoryId);
    }

    public CategoryEntity getCategoryByName(String categoryName) {
        return categoryRepository.getCategoryByName(categoryName);
    }


    public void addCategory(CategoryEntity categoryEntity) {
        categoryRepository.save(categoryEntity);
    }

    public void addCategory(NewCategoryDto newCategoryDto) {
        addCategory(categoryMapper.dtoToNewEntity(newCategoryDto));
    }

    public CategoryEntity getOrAddCategory(String categoryName) {
        CategoryEntity categoryEntity = getCategoryByName(categoryName);
        if(categoryEntity==null) {
            addCategory(new CategoryEntity(0, categoryName));
        }
        return getCategoryByName(categoryName);
    }
}
