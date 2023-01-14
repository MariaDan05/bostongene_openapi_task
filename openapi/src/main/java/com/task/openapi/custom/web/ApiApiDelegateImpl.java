package com.task.openapi.custom.web;

import com.task.openapi.custom.repository.DrugRepository;
import com.task.openapi.generated.model.CreatedResponse;
import com.task.openapi.custom.model.Drug;
import com.task.openapi.generated.model.DrugCreateRequest;
import com.task.openapi.generated.model.DrugResponse;
import com.task.openapi.generated.web.ApiApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApiApiDelegateImpl implements ApiApiDelegate {
    @Autowired
    private DrugRepository drugRepository;

    @Override
    public ResponseEntity<CreatedResponse> apiDrugsPost(DrugCreateRequest drugCreateRequest) {
        if(RequestValidator.isValidDrugCreateRequest(drugCreateRequest)) {
            Drug newDrug = new Drug(drugCreateRequest.getName(), drugCreateRequest.getNationalDrugCode(),
                    drugCreateRequest.getDescription());
            this.drugRepository.save(newDrug);

            return new ResponseEntity<>(new CreatedResponse().message(String.format("Drug %s Created Successfully",
                                                                     drugCreateRequest.getName())), HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<DrugResponse> apiDrugsDrugIdGet(UUID drugId) {
        Drug drug = this.drugRepository.findById(drugId)
                .orElse(null);
        if(drug == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        DrugResponse response = new DrugResponse();
        response.setDrugId(drug.getDrugId());
        response.setName(drug.getName());
        response.setNationalDrugCode(drug.getNationalDrugCode());
        response.setDescription(drug.getDescription());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
