package M1S10.M1S10.services;

import M1S10.M1S10.dtos.LoginRequestDto;
import M1S10.M1S10.dtos.LoginResponseDto;

public interface LoginService {

    public LoginResponseDto authenticate(LoginRequestDto dto);
    }

