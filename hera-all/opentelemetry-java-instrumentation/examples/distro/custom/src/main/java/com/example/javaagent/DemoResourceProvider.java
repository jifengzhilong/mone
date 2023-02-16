package com.example.javaagent;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.autoconfigure.ConfigProperties;
import io.opentelemetry.sdk.autoconfigure.spi.ResourceProvider;
import io.opentelemetry.sdk.resources.Resource;

public class DemoResourceProvider implements ResourceProvider {
  @Override
  public Resource createResource(ConfigProperties config) {
    Attributes attributes = Attributes.builder().put("custom.resource", "demo").build();
    return Resource.create(attributes);
  }
}
