package com.smsintrigation.controller;

import com.smsintrigation.payload.SmsDto;
import com.smsintrigation.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send-sms")
   public void sendSms(@RequestBody SmsDto dto){
        smsService.sendSms(dto.getTo(),dto.getBody());

    }

}
