package com.irojas.demojwt.services;

import com.irojas.demojwt.models.AuthResponse;
import com.irojas.demojwt.models.LoginRequest;
import com.irojas.demojwt.models.RegisterRequest;

public interface IAuthService {
    
    public AuthResponse login(LoginRequest request);
    public AuthResponse register(RegisterRequest request);


}
