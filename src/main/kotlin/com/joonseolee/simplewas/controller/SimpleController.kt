package com.joonseolee.simplewas.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.servlet.http.HttpServletRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress
import java.time.LocalDateTime

private val logger = KotlinLogging.logger {}

@Tag(name = "Simple 컨트롤러", description = "간단하게 서버를 올리기위해 만든 예제 프로그램")
@RequestMapping(value = ["/simple"])
@RestController
class SimpleController {

    @Operation(summary = "서버정보 조회", description = "서버이름, 포트, 호스트이름, 주소 를 리턴한다.")
    @GetMapping
    fun showServerInfo(request: HttpServletRequest): String {
        val localhost = InetAddress.getLocalHost()
        val hostName = localhost.hostName // 호스트 이름
        val hostAddress = localhost.hostAddress // IP 주소

        logger.info { "it is close to return the info ${LocalDateTime.now()}" }
        return "Name: ${request.serverName}, Port: ${request.serverPort}, hostName: $hostName, hostAddress: $hostAddress"
    }
}