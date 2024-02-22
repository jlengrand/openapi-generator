package org.openapitools.codegen.languages;

import org.openapitools.codegen.*;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.MapProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.parameters.Parameter;

import java.io.File;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurlClientCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    private final Logger LOGGER = LoggerFactory.getLogger(CurlClientCodegen.class);

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "curl";
    }

    public String getHelp() {
        return "Generates a curl client.";
    }

    public CurlClientCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "curl";
        apiTemplateFiles.put("api.mustache", ".sh");
        embeddedTemplateDir = templateDir = "curl";
        apiPackage = "Apis";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
    }
}
