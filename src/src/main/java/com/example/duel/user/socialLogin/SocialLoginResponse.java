package com.example.duel.user.socialLogin;

public class SocialLoginResponse{
    public record UserInfoDto(String nickname, String email){};

    public record TokenDTO(String accessToken){};
}


