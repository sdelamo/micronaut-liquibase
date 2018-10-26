package com.hhimanshu.persistence.repositories;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class AuthorRepositoryImpl implements AuthorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public AuthorRepositoryImpl(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
