package com.task.openapi.generated.web;

import com.task.openapi.generated.model.CreatedResponse;
import com.task.openapi.generated.model.DrugCreateRequest;
import com.task.openapi.generated.model.DrugResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.Optional;
import java.util.UUID;

/**
 * A delegate to be called by the {@link ApiApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-13T22:12:47.351285600+04:00[Asia/Yerevan]")
public interface ApiApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/drugs/{drugId}
     *
     * @param drugId Identification of entity record. (required)
     * @return Successful operation (status code 200)
     * @see ApiApi#apiDrugsDrugIdGet
     */
    default ResponseEntity<DrugResponse> apiDrugsDrugIdGet(UUID drugId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"description\" : \"description\", \"drugId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"nationalDrugCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/drugs
     *
     * @param drugCreateRequest Create a new drug in the system (optional)
     * @return Successful operation (status code 200)
     * @see ApiApi#apiDrugsPost
     */
    default ResponseEntity<CreatedResponse> apiDrugsPost(DrugCreateRequest drugCreateRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
