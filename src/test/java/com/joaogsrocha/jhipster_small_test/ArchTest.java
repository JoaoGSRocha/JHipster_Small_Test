package com.joaogsrocha.jhipster_small_test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.joaogsrocha.jhipster_small_test");

        noClasses()
            .that()
                .resideInAnyPackage("com.joaogsrocha.jhipster_small_test.service..")
            .or()
                .resideInAnyPackage("com.joaogsrocha.jhipster_small_test.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..com.joaogsrocha.jhipster_small_test.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
