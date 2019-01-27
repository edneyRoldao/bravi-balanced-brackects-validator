package com.bravi.balancedbracketsvalidator.service;

import org.springframework.stereotype.Service;

@Service
public class BracketsSequenceServiceImpl implements BracketsSequenceService {

    private static final String PATTERN_REGEXP = "[(|)|{|}|\\[\\]]+";
    private static final String ENCLOSING_BRACKETS_REGEXP = "[)|}|\\]]+";

    @Override
    public Boolean validateBracketsSequence(String bracketsSequence) {
        if (bracketsSequence == null || bracketsSequence.trim().isEmpty())
            return false;

        // todo - I need to verify whether validation is required or not
        String checkValue = bracketsSequence.replaceAll(" ", "");

        // return false when the very first character does not match with any opening brackets
        if (checkValue.substring(0, 1).matches(ENCLOSING_BRACKETS_REGEXP))
            return false;

        if (checkValue.length() % 2 != 0)
            return false;

        // return false when the value contains any character not allowed.
        if (!checkValue.matches(PATTERN_REGEXP))
            return false;

        while (checkValue.contains("()") || checkValue.contains("{}") || checkValue.contains("[]")) {
            checkValue = checkValue
                    .replaceAll("\\{\\}", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\(\\)", "");
        }

        return checkValue.length() == 0;
    }

}
