package com.bravi.balancedbracketsvalidator.util;

public class SwaggerConstants {

    public static final String SERVICE_VALUE = "service that determines if the order of the brackets is valid";
    public static final String SERVICE_NOTE = "We say a sequence of brackets is valid if the following conditions are met \n" +
            "- It contains no unmatched brackets \n" +
            "- The subset of brackets enclosed within the confines of a matched pair of brackets is\n" +
            "also a matched pair of brackets.";

}
