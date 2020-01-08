package pl.asprojects.nosItems.mapper;

import org.springframework.stereotype.Component;
import pl.asprojects.nosItems.dto.AccountDto;
import pl.asprojects.nosItems.dto.NewAccountDto;
import pl.asprojects.nosItems.model.AccountEntity;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccountMapper {

    public AccountDto entityToDto(AccountEntity AccountEntity) {
        return new AccountDto(AccountEntity.getId(), AccountEntity.getLogin());
    }

    public NewAccountDto newAccountDto(AccountEntity accountEntity) {
        return new NewAccountDto(accountEntity.getLogin());
    }

    public AccountEntity dtoToEntity(AccountDto accountDto) {
        return new AccountEntity(accountDto.getId(), accountDto.getLogin());
    }

    public AccountEntity dtoToNewEntity(NewAccountDto newAccountDto) {
        return new AccountEntity(0, newAccountDto.getLogin());
    }

    public List<AccountDto> accountListToDto(List<AccountEntity> accountEntityList) {
        return accountEntityList.stream().map(this::entityToDto).collect(Collectors.toList());
    }
}
