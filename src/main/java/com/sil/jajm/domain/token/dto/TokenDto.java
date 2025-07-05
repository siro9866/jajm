package com.sil.jajm.domain.token.dto;

import com.sil.jajm.domain.token.entity.Tokens;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


public class TokenDto {

	@Getter
	@Setter
	public static class CreateRequest {
		private String username;
		private String refreshToken;
		private LocalDateTime refreshTokenExpiration;

		// DTO -> Entity 로 변환
		public Tokens toEntity() {
			return Tokens.builder()
					.username(username)
					.refreshToken(refreshToken)
					.refreshTokenExpiration(refreshTokenExpiration)
					.build();
		}
	}

}
