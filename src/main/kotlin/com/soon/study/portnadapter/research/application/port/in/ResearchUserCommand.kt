package com.soon.study.portnadapter.research.application.port.`in`

import com.soon.study.portnadapter.research.domain.research.enums.Sex
import java.time.LocalDate

data class ResearchUserCommand(
    val memberId: String,
    val sex: Sex,
    val birthday: LocalDate,
    val address: String,
    val job: String,
    val isMarriage: Boolean,
    val childrenNumber: Int,
)
