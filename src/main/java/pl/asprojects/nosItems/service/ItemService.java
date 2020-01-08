package pl.asprojects.nosItems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.asprojects.nosItems.dto.NewItemDto;
import pl.asprojects.nosItems.mapper.CategoryMapper;
import pl.asprojects.nosItems.model.CategoryEntity;
import pl.asprojects.nosItems.model.ItemEntity;
import pl.asprojects.nosItems.repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    CategoryService categoryService;

    public void addItem(NewItemDto newItemDto) {
        itemRepository.save(new ItemEntity(
                0, newItemDto.getName(), newItemDto.getAct(), newItemDto.getPictureUrl(), newItemDto.getInventoryType(), categoryService.getOrAddCategory( newItemDto.getCategory().getName() )
        ));
    }
}
