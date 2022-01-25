package com.sid.demogradle.repository;

import com.sid.demogradle.model.Tutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    Page<Tutorial> findByPublished(boolean published, Pageable pageable);
    Page<Tutorial> findByTitleContaining(String title, Pageable pageable);
    Page<Tutorial> findById(long id, Pageable pageable);
}
