package com.ibicd.springbootdemo.config;

import com.ibicd.springbootdemo.config.JulieAutoConfiuration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class JulieGroup implements DeferredImportSelector.Group{
    private List<Entry> entryList = new ArrayList<>();

    @Override
    public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
        entryList.add(new Entry(metadata, JulieAutoConfiuration.class.getName()));
    }

    @Override
    public Iterable<Entry> selectImports() {
        return entryList;
    }
}
