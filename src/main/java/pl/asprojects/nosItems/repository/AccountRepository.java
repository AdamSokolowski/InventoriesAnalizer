package pl.asprojects.nosItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.asprojects.nosItems.model.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

    public AccountEntity findByLogin(String login);
}
