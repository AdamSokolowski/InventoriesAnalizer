package pl.asprojects.nosItems.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.asprojects.nosItems.dto.CharacterBasicInfoDto;
import pl.asprojects.nosItems.dto.CharacterDetailsDto;
import pl.asprojects.nosItems.model.CharacterEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CharacterMapper {

    public CharacterBasicInfoDto basicInfoDto(CharacterEntity characterEntity) {
        return new CharacterBasicInfoDto(characterEntity.getId(), characterEntity.getName(), characterEntity.getAccount().getLogin());
    }

    public List<CharacterBasicInfoDto> basicInfoListDto(List<CharacterEntity> characterEntityList) {
        return characterEntityList.stream().map(this::basicInfoDto).collect(Collectors.toList());
    }

    public CharacterDetailsDto detailInfoDto(CharacterEntity characterEntity) {
        return new CharacterDetailsDto(characterEntity.getId(), characterEntity.getName(), characterEntity.getLvl(), characterEntity.getJlvl(),
                                        characterEntity.getClvl(), characterEntity.getCharacterClassEntity(), characterEntity.getAccount());
    }

    public List<CharacterDetailsDto> detailsInfoListDto(List<CharacterEntity> characterEntityList) {
        return characterEntityList.stream().map(this::detailInfoDto).collect(Collectors.toList());
    }

}
