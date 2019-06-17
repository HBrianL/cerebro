package com.magneto.cerebro.controllers;

import com.magneto.cerebro.controllers.models.DnaRequest;
import com.magneto.cerebro.domain.Dna;
import com.magneto.cerebro.service.IDnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class CerebroController {
    @Autowired
    private IDnaService dnaService;

    @RequestMapping(method = POST)
    public HttpStatus mutant(@RequestBody DnaRequest dnaRequest) {
        String[] dna = dnaRequest.getDna();
        boolean isMutant = dnaService.isMutant(dna);

        Dna dnaEntity = new Dna();
        dnaEntity.setDna(Arrays.toString(dna));
        dnaEntity.setIsMutant(isMutant);

        dnaService.addDna(dnaEntity);

        if (isMutant)
            return HttpStatus.OK;
        else
            return HttpStatus.FORBIDDEN;
    }
}
