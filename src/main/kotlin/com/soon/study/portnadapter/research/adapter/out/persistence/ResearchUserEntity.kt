package com.soon.study.portnadapter.research.adapter.out.persistence

import com.soon.study.portnadapter.research.domain.research.enums.Sex
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.io.Serializable
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "research_user")
class ResearchUserEntity(
    @Id
    @Column(name = "member_id", updatable = false, nullable = false)
    val memberId: String,

    @Column(name = "member_uid")
    val memberUid: Long,

    @Column(name = "hash_id")
    val hashId: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    val sex: Sex,

    @Column(name = "birthday")
    val birthday: LocalDate,

    @Column(name = "address")
    val address: String,

    @Column(name = "job")
    val job: String,

    @Column(name = "is_marriage")
    val isMarriage: Boolean,

    @Column(name = "children_number")
    val childrenNumber: Int,

    @Column(name = "create_dt", updatable = false)
    val createDate: LocalDateTime,

    @Column(name = "update_dt")
    val updateDate: LocalDateTime,
) : Serializable {

}
