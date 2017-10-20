package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Battery
{
  @JsonProperty("health")
  public String health;
  @JsonProperty("level")
  public int level;
  @JsonProperty("scale")
  public int scale;
  @JsonProperty("source")
  public String source;
  @JsonProperty("status")
  public String status;
  @JsonProperty("temp")
  public float temp;
  @JsonProperty("voltage")
  public float voltage;

  public Battery() {}
}
