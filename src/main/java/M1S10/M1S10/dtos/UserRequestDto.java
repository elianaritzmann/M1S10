package M1S10.M1S10.dtos;

import M1S10.M1S10.enums.UserStatus;

public record UserRequestDto(
        String name,
        String username,
         String password,
        UserStatus profile
){


}
