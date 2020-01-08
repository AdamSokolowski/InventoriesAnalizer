package pl.asprojects.nosItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asprojects.nosItems.model.CharacterEntity;

import java.util.List;

public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

}
