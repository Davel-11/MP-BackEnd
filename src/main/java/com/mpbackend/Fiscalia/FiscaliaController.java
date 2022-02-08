package com.mpbackend.Fiscalia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity addFiscalia(
            @RequestBody Fiscalia fiscalia
    ) {
        return new ResponseEntity( this.fiscaliaService.addFiscalia(fiscalia), HttpStatus.OK );
    }

    @PutMapping
    public ResponseEntity editFiscalia(
            @RequestBody Fiscalia fiscalia
    ) {
        return new ResponseEntity( this.fiscaliaService.addFiscalia(fiscalia), HttpStatus.OK );
    }

    @DeleteMapping
    public ResponseEntity removeFiscalia(
            @RequestParam(value = "id", required = true) Integer id
    ) {
        return new ResponseEntity( this.fiscaliaService.removeFiscalia(id), HttpStatus.OK );
    }

}
