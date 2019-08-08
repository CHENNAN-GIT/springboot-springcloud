package com.chennan.providerticket.services;

import org.springframework.stereotype.Service;

/**
 * @author ：chen.nan
 * @date ：Created in 2019/8/5 15:07
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("port ----> " + 8003);
        return "《哪吒之魔童降世》";
    }

}
