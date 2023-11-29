package org.openapitools.codegen.jetbrains.http.client;

import org.junit.Test;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.openapitools.codegen.TestUtils.*;
import static org.testng.Assert.*;

public class JetbrainsHttpClientClientCodegenTest {

    @Test
    public void testBasicGeneration() throws IOException {

        File output = Files.createTempDirectory("jetbrains-http-client-test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("jetbrains-http-client")
                .setInputSpec("src/test/resources/3_0/jetbrains-http-client/Basic.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(clientOptInput).generate();
        files.forEach(File::deleteOnExit);

        Path path = Paths.get(output + "/Apis/BasicApi.http");
        assertFileExists(path);

        assertFileContentEquals(path, Paths.get("src/test/resources/3_0/jetbrains-http-client/BasicResult.http"));
    }

    @Test
    public void testBasicGenerationJson() throws IOException {

        File output = Files.createTempDirectory("jetbrains-http-client-test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("jetbrains-http-client")
                .setInputSpec("src/test/resources/3_0/jetbrains-http-client/Basic.json")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(clientOptInput).generate();
        files.forEach(File::deleteOnExit);

        Path path = Paths.get(output + "/Apis/BasicApi.http");
        assertFileExists(path);

        assertFileContentEquals(path, Paths.get("src/test/resources/3_0/jetbrains-http-client/BasicResult.http"));
    }
}
