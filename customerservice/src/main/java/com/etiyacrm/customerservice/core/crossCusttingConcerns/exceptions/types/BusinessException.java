package com.etiyacrm.customerservice.core.crossCusttingConcerns.exceptions.types;

import com.etiyacrm.customerservice.core.crossCusttingConcerns.exceptions.details.BusinessProblemDetails;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}
