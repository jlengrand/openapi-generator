package org.openapitools.codegen.languages;

import com.google.common.collect.ImmutableMap;
import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import org.openapitools.codegen.*;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.openapitools.codegen.model.ApiInfoMap;
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.OperationMap;
import org.openapitools.codegen.model.OperationsMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JetbrainsHttpClientClientCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "Jetbrains HTTP Client";

    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    public String getName() {
        return "jetbrains-http-client";
    }

    public String getHelp() {
        return "Generates a jetbrains-http client. See https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html";
    }

    public JetbrainsHttpClientClientCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "jetbrains-http-client";
        apiTemplateFiles.put("api.mustache", ".http");
        embeddedTemplateDir = templateDir = "jetbrains-http-client";
        apiPackage = "Apis";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
    }

    @Override
    protected ImmutableMap.Builder<String, Mustache.Lambda> addMustacheLambdas() {

        return super.addMustacheLambdas()
                .put("doubleMustache", new DoubleMustacheLambda());
    }

    public static class DoubleMustacheLambda implements Mustache.Lambda {
        @Override
        public void execute(Template.Fragment fragment, Writer writer) throws IOException {
            String text = fragment.execute();
            writer.write(text
                    .replaceAll("\\{", "{{")
                    .replaceAll("}", "}}")
            );
        }
    }

    @Override
    public Map<String, Object> postProcessSupportingFileData(Map<String, Object> bundle) {

        return bundle;
    }

    @Override
    public OperationsMap postProcessOperationsWithModels(OperationsMap objs, List<ModelMap> allModels) {
        return super.postProcessOperationsWithModels(objs, allModels);
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
