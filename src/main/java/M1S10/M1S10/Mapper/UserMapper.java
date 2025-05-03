package M1S10.M1S10.Mapper;

import M1S10.M1S10.dtos.UserRequestDto;
import M1S10.M1S10.dtos.UserResponseDto;
import M1S10.M1S10.entities.UserEntity;

import java.util.List;

public class UserMapper {
    
    public static UserResponseDto responseDto (UserEntity user){
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getUsername(),
                user.getProfile()
                );
    }

    public static List<UserResponseDto> responseDtos (List<UserEntity>user){
        return user.stream().map(UserMapper::responseDto).toList();
    }

    public static UserEntity toEntity(UserEntity user, UserRequestDto dto) {
        user.setName(dto.name());
        user.setUsername(dto.username());
        user.setProfile(dto.profile());

        return user;

    }


}

