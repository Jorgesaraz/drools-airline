package com.udea.drools_airline.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    private static final KieServices kieServices = KieServices.Factory.get();
    private static final String RULES_AIRLINE_DRL = "rules/airline_rules.drl";

    @Bean
    public KieContainer kieContainer() {
        // Forzar a Drools a no usar MVEL para evitar el ClassNotFoundException de java.lang.Compiler
        System.setProperty("drools.dialect.default", "java");

        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_AIRLINE_DRL));

        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();

        Results results = kieBuilder.getResults();
        if (results.hasMessages(org.kie.api.builder.Message.Level.ERROR)) {
            System.out.println("=== ERRORES EN EL ARCHIVO DRL ===");
            System.out.println(results.getMessages());
            throw new IllegalStateException("Error al compilar las reglas de Drools: " + results.getMessages());
        }

        KieModule kieModule = kieBuilder.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}