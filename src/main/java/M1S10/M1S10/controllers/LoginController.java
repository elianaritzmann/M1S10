package M1S10.M1S10.controllers;

import M1S10.M1S10.dtos.LoginRequestDto;
import M1S10.M1S10.dtos.LoginResponseDto;
import M1S10.M1S10.services.LoginServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    private LoginServiceImpl service;

    @PostMapping
    private LoginResponseDto login(@RequestBody LoginRequestDto dto){
        return service.authenticate(dto);
    }
}
