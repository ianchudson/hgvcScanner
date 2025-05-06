package org.ich.modelGenerator;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HGVCModelGenerator {
    // create a main method to generate a json schema from file
    public static void main(String[] args) throws IOException {

        JCodeModel cm = new JCodeModel();
        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }
            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        URL schemaRef = HGVCModelGenerator.class.getClassLoader().getResource("hgvc_sample.json");

        System.out.println(System.getProperty("user.dir"));

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(cm, "hgvcAvailability", "org.ich.models", schemaRef);

        cm.build(new File("./src/main/java/"));
    }
}
