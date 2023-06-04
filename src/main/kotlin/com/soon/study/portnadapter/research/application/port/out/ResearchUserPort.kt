package com.soon.study.portnadapter.research.application.port.out

import com.soon.study.portnadapter.research.adapter.out.persistence.ResearchUserEntity
import com.soon.study.portnadapter.research.domain.research.ResearchUser

interface ResearchUserPort {
    fun save(researchUser: ResearchUser)
}
