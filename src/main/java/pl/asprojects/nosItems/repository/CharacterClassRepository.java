package pl.asprojects.nosItems.repository;

import org.springframework.data.repository.CrudRepository;
import pl.asprojects.nosItems.model.CharacterClassEntity;

public interface CharacterClassRepository extends CrudRepository<CharacterClassEntity, Integer> {

    public CharacterClassEntity findByName(String name);
}
