package com.joonseolee.simplewas.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress



@RequestMapping(value = ["/simple"])
@RestController
class SimpleController {

    @GetMapping
    fun showServerInfo(request: HttpServletRequest): String {
        val localhost = InetAddress.getLocalHost()
        val hostName = localhost.hostName // 호스트 이름
        val hostAddress = localhost.hostAddress // IP 주소

        return "Name: ${request.serverName}, Port: ${request.serverPort}, hostName: $hostName, hostAddress: $hostAddress"
    }
}