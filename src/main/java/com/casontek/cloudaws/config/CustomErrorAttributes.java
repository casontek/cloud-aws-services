package com.casontek.cloudaws.config;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;
import java.util.Objects;

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes {
    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        String errorMessage = errorAttributes.get("error").toString();
        String status = errorAttributes.get("status").toString();
        String path = errorAttributes.get("path").toString();
        if(Objects.equals(status, "404")) {
            errorMessage = ((ServletWebRequest)webRequest).getRequest().getRequestURL().toString().replace("/error", path) + " Not Found.";
        }
        //removes unnecessary attributes
        errorAttributes.remove("error");
        errorAttributes.remove("path");
        errorAttributes.remove("status");
        errorAttributes.remove("timestamp");
        //adds required attributes
        errorAttributes.put("message", errorMessage);
        errorAttributes.put("code", status);
        errorAttributes.put("data", null);

        return errorAttributes;
    }
}
