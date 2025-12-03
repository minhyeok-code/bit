package org.example.bitcoinlion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitController {
    Logger log = LoggerFactory.getLogger(BitController.class);

    @GetMapping("/")
    public String index() {
        return "BitcoinLion /";
    }

    @GetMapping("/bit")
    public String bit() {
        return "BitcoinLion /bit";
    }

    @GetMapping("/log-test")
    public String logTest() {
        log.info("INFO 로그입니다. 평소에도 잘 보인대요");
        log.debug("DEBUG 로그입니다. 평소에는 잘 안 보인대");
        return "BitcoinLion /log-test";
    }

    @GetMapping("/sleep")
    public String sleep()  throws InterruptedException {
        Thread.sleep(5000);
        return "wake up";
    }
    @GetMapping("/jenkins")
    public String jenkins() {
        return "jenkins /jenkins";
    }
}
