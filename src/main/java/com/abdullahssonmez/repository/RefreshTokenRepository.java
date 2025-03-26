package com.abdullahssonmez.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullahssonmez.model.RefreshToken;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{

	Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
