
package my.pkg.name.commapp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.pkg.name.commapp.model.Pong;

@RestController
public class PingController {

    private static final Logger LOG = LogManager.getLogger(PingController.class);

    @RequestMapping("/ping")
    public Pong ping() {

        LOG.info("Heard a request to the Ping Controller");

        return new Pong(1);
    }
}