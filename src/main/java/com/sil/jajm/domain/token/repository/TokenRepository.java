package com.sil.jajm.domain.token.repository;


import com.sil.jajm.domain.token.entity.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Tokens, String> {

	// 메서드 확인(키값등 재설계)
	
	Boolean existsByRefreshToken(String refresh);
	void deleteByUsername(String username);
	void deleteByRefreshToken(String refresh);
	
}
