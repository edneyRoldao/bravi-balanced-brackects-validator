package com.bravi.balancedbracketsvalidator.controller;

import com.bravi.balancedbracketsvalidator.service.BracketsSequenceService;
import com.bravi.balancedbracketsvalidator.util.SwaggerConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping("brackets-sequence")
public class BracketsSequenceController {

    @Autowired
    private BracketsSequenceService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = SwaggerConstants.SERVICE_VALUE, notes = SwaggerConstants.SERVICE_NOTE)
    public Boolean validateBrackestSequence(@RequestParam String bracketsSequence) {
        return service.validateBracketsSequence(bracketsSequence);
    }

}
