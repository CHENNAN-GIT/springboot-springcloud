package com.chennan.providerticket.controllers;

import com.chennan.providerticket.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chen.nan
 * @date ：Created in 2019/8/5 15:08
 */
@RequestMapping("/provider")
@RestController
public class TicketController {

    @Autowired TicketService ticketService;

    @GetMapping("getTicket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
