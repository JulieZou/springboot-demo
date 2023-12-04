package com.ibicd.springbootdemo.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class JulieImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.ibicd.springbootdemo.config.JulieAutoConfiuration"};
    }

    @Override
    public Class<? extends Group> getImportGroup() {
        return JulieGroup.class;
    }
}
