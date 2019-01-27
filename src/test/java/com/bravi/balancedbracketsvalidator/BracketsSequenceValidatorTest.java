package com.bravi.balancedbracketsvalidator;

import com.bravi.balancedbracketsvalidator.service.BracketsSequenceService;
import com.bravi.balancedbracketsvalidator.service.BracketsSequenceServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
public class BracketsSequenceValidatorTest {

    @TestConfiguration
    static class BracketsSequenceServiceTestContextConfig {
        @Bean
        public BracketsSequenceService bracketsSequenceService() {
            return new BracketsSequenceServiceImpl();
        }
    }

    @Autowired
    private BracketsSequenceService service;

    @Test
    public void testWhenBracketsSequeceIsValid() {
        String firstValidSequence = "(){}[]";
        String secondValidSequence = " [{()}] (){} ";

        boolean firstTest = service.validateBracketsSequence(firstValidSequence);
        boolean secondTest = service.validateBracketsSequence(secondValidSequence);

        assertThat(firstTest).isEqualTo(true);
        assertThat(secondTest).isEqualTo(true);
    }

    @Test
    public void testWhenBracketsSequeceIsInvalid() {
        String firstInvalidSequence = "[]{()";
        String secondInvalidSequence = "[{)]";

        boolean firstTest = service.validateBracketsSequence(firstInvalidSequence);
        boolean secondTest = service.validateBracketsSequence(secondInvalidSequence);

        assertThat(firstTest).isEqualTo(false);
        assertThat(secondTest).isEqualTo(false);
    }

}
