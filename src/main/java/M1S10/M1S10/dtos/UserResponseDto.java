package M1S10.M1S10.dtos;

import M1S10.M1S10.enums.UserStatus;

public record UserResponseDto(
         Long id,
         String name,
         String username,
         UserStatus profile
){





}
