package com.sil.jajm.domain.token.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

/**
 * 리프레시토큰관리
 * 필드 추가등 학인필요
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "TOKEN")
public class Tokens {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="ID", nullable = false, length = 36)
	private String id;

	@Comment("아이디")
	@Column(name = "USERNAME", unique = true, nullable = false, length = 50)
	private String username;

	@Comment("리프레시토큰")
	@Column(name = "REFRESH_TOKEN", nullable = false, length = 300)
	private String refreshToken;

	@Comment("리프레시토큰만료일시")
	@Column(name = "REFRESH_TOKEN_EXPIRATION")
	private LocalDateTime refreshTokenExpiration;

	@CreatedDate
	@Column(name = "CREATED_AT", updatable = false)
	private LocalDateTime createdAt;

}
