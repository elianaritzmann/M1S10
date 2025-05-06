package M1S10.M1S10.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class LoginRequestDto {

        private String username;
        private String password;



}
