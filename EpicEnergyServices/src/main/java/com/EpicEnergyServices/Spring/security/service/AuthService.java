package com.EpicEnergyServices.Spring.security.service;

import com.EpicEnergyServices.Spring.security.payload.LoginDto;
import com.EpicEnergyServices.Spring.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
