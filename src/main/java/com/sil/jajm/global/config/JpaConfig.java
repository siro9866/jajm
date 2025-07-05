package com.sil.jajm.global.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sil.jajm.global.component.AuditAwareImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
//@EnableJpaRepositories(basePackages = "com.sil.jajm")
public class JpaConfig {
    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    public JPAQueryFactory queryFactory() {
        return new JPAQueryFactory(entityManager);
    }

    // 등록/수정자 정보 자동저장
    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditAwareImpl();
    }
}
