package com.emre.repository;

import com.emre.entity.Calisan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface CalisanRepository extends JpaRepository<Calisan, Long> {
}
