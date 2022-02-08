package com.mpbackend.Fiscalia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "api/fiscalia", produces = MediaType.APPLICATION_JSON_VALUE )
public class FiscaliaController {

    @Autowired
    FiscaliaService fiscaliaService;

    @GetMapping()
    public ResponseEntity getFiscalias() {
        return new ResponseEntity( this.fiscaliaService.getFiscalias(), HttpStatus.OK );
    }

    @GetMapping("single")
    public ResponseEntity getOneFiscalia(
            @RequestParam(value = "id", required = true ) Integer id
    ) {
        return new ResponseEntity( this.fiscaliaService.getOneFiscalia(id), HttpStatus.OK );
    }


}
