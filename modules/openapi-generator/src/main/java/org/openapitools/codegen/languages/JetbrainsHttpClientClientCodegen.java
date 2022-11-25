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

public class JetbrainsHttpClientClientCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    static final Logger LOGGER = LoggerFactory.getLogger(JetbrainsHttpClientClientCodegen.class);

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "jetbrains-http-client";
    }

    public String getHelp() {
        return "Generates a jetbrains-http-client client.";
    }

    public JetbrainsHttpClientClientCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "jetbrains-http-client";
        modelTemplateFiles.put("model.mustache", ".http");
        apiTemplateFiles.put("api.mustache", ".http");
        embeddedTemplateDir = templateDir = "jetbrains-http-client";
        apiPackage = "Apis";
        modelPackage = "Models";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        // TODO: Fill this out.
    }

    @Override
//    protected ImmutableMap.Builder<String, Lambda> addMustacheLambdas() {
//        return super.addMustacheLambdas()
//                .put("doubleMustache", new DoubleMustache());
//    }
//
//    private static class DoubleMustache implements Mustache.Lambda {
//        @Override
//        public void execute(final Template.Fragment fragment, final Writer writer) throws IOException {
//            writer.write(fragment.execute().replaceAll("{", "{{"));
//        }
//    }
}
