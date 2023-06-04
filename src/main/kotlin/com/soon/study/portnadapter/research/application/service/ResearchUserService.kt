package com.soon.study.portnadapter.research.application.service

import com.soon.study.portnadapter.research.adapter.out.persistence.ResearchUserEntity
import com.soon.study.portnadapter.research.application.port.`in`.ResearchUserCommand
import com.soon.study.portnadapter.research.application.port.`in`.ResearchUserUseCase
import com.soon.study.portnadapter.research.application.port.out.ResearchUserPort
import com.soon.study.portnadapter.research.domain.research.ResearchUser
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ResearchUserService(
    private val researchUserPort: ResearchUserPort,
) : ResearchUserUseCase {
    override fun save(researchUserCommand: ResearchUserCommand) {
        val researchUser = toResearchUser(researchUserCommand)
        researchUserPort.save(researchUser)
    }

    private fun toResearchUser(command: ResearchUserCommand): ResearchUser {
        return ResearchUser(
            memberId = command.memberId,
            memberUid = 0L,
            hashId = "",
            sex = command.sex,
            birthday = command.birthday,
            address = command.address,
            job = command.job,
            isMarriage = command.isMarriage,
            childrenNumber = command.childrenNumber,
            createDate = LocalDateTime.now(),
            updateDate = LocalDateTime.now()
        )
    }
}
