package pl.asprojects.nosItems.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.asprojects.nosItems.dto.CategoryDto;
import pl.asprojects.nosItems.dto.ItemDto;
import pl.asprojects.nosItems.dto.NewItemDto;
import pl.asprojects.nosItems.model.ItemEntity;

@Component
public class ItemMapper {

    @Autowired
    CategoryMapper categoryMapper;

    public ItemDto itemDto(ItemEntity itemEntity) {
        return new ItemDto(itemEntity.getId(), itemEntity.getName(), itemEntity.getAct(), itemEntity.getPictureUrl(), itemEntity.getInventoryType(), categoryMapper.entityToDto(itemEntity.getCategory()));
    }

    public NewItemDto newItemDto(ItemEntity itemEntity) {
        return new NewItemDto(itemEntity.getName(), itemEntity.getAct(), itemEntity.getPictureUrl(), itemEntity.getInventoryType(), categoryMapper.entityToDto(itemEntity.getCategory()));
    }


}
