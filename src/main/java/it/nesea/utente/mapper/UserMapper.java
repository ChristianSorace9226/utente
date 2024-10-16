package it.nesea.utente.mapper;

import it.nesea.utente.dto.UserDto;
import it.nesea.utente.model.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class UserMapper {

    public abstract UserDto toDto(User user);
    public abstract User toEntity(UserDto userDto);
    public abstract List<UserDto> toUserDtoList(List<User> userList);
    public abstract List<User> toUserEntityList(List<UserDto> userDtoList);

}
