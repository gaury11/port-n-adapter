package com.soon.study.portnadapter.research.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface ResearchUserRepository : JpaRepository<ResearchUserEntity, String> {
}
