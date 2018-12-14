package com.ezimax.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
