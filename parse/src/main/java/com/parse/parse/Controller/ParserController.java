package com.parse.parse.Controller;

import com.parse.parse.Service.ParserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/par/")
public class ParserController {
private final ParserService parserService;

    public ParserController(ParserService parserService) {
        this.parserService = parserService;
    }

    @PostMapping("saveinfo")
    public void saveinfo(@RequestBody String XML){
        parserService.saveinfo(XML);
    }


}
