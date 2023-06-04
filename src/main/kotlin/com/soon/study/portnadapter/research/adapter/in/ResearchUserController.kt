package com.soon.study.portnadapter.research.adapter.`in`

import com.soon.study.portnadapter.research.application.port.`in`.ResearchUserUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/research/api/v1/user")
class ResearchUserController(
    private val researchUserUseCase: ResearchUserUseCase,
) {
    @PostMapping("")
    fun save() {

    }
}

