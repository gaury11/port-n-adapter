package com.soon.study.portnadapter.research.adapter.out.persistence

import com.soon.study.portnadapter.research.application.port.out.ResearchUserPort
import com.soon.study.portnadapter.research.domain.research.ResearchUser
import org.springframework.stereotype.Component

@Component
class ResearchUserAdapter(
    private val researchUserRepository: ResearchUserRepository,
) : ResearchUserPort {
    override fun save(researchUser: ResearchUser) {
        val entity = toEntity(researchUser)
        researchUserRepository.save(entity)
    }

    private fun toEntity(researchUser: ResearchUser): ResearchUserEntity {
        return ResearchUserEntity(
            memberId = researchUser.memberId,
            memberUid = researchUser.memberUid,
            hashId = researchUser.hashId,
            sex = researchUser.sex,
            birthday = researchUser.birthday,
            address = researchUser.address,
            job = researchUser.job,
            isMarriage = researchUser.isMarriage,
            childrenNumber = researchUser.childrenNumber,
            createDate = researchUser.createDate,
            updateDate = researchUser.updateDate
        )
    }
}
