package com.soon.study.portnadapter.research.domain.research

import com.soon.study.portnadapter.research.domain.research.enums.Sex
import java.time.LocalDate
import java.time.LocalDateTime

data class ResearchUser(
    val memberId: String,
    val memberUid: Long,
    val hashId: String,
    val sex: Sex,
    val birthday: LocalDate,
    val address: String,
    val job: String,
    val isMarriage: Boolean,
    val childrenNumber: Int,
    val createDate: LocalDateTime,
    val updateDate: LocalDateTime,
)
