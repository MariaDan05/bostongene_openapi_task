package com.task.openapi.generated.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Generated;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-13T22:12:47.351285600+04:00[Asia/Yerevan]")
@Controller
@RequestMapping("${openapi.openAPISpecificationForTesting.base-path:}")
public class ApiApiController implements ApiApi {

    private final ApiApiDelegate delegate;

    public ApiApiController(@Autowired(required = false) ApiApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ApiApiDelegate() {});
    }

    @Override
    public ApiApiDelegate getDelegate() {
        return delegate;
    }

}
