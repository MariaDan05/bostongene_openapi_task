package com.task.openapi.custom.web;

import com.task.openapi.generated.model.DrugCreateRequest;

public class RequestValidator {
    public static boolean isValidDrugCreateRequest(DrugCreateRequest drugCreateRequest) {
        return !drugCreateRequest.getName().isEmpty() && drugCreateRequest.getName() != null &&
                drugCreateRequest.getNationalDrugCode() != null && !drugCreateRequest.getDescription().isEmpty() &&
                drugCreateRequest.getDescription() != null;
    }
}
