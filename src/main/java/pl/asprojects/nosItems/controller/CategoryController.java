package pl.asprojects.nosItems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.asprojects.nosItems.dto.NewCategoryDto;
import pl.asprojects.nosItems.service.CategoryService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/nos/item/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping(value = "newcategory", consumes = APPLICATION_JSON_VALUE)
    public void addCategory(@RequestBody NewCategoryDto newCategory) {
        categoryService.addCategory(newCategory);
    }
}
