package com.salles.apimarvel.feingcli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Character;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CharacterDataContainer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-14T17:39:08.628078500-03:00[America/Sao_Paulo]")


public class CharacterDataContainer   {
  @JsonProperty("offset")
  private BigDecimal offset = null;

  @JsonProperty("limit")
  private BigDecimal limit = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  @JsonProperty("count")
  private BigDecimal count = null;

  @JsonProperty("results")
  @Valid
  private List<java.lang.Character> results = null;

  public CharacterDataContainer offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The requested offset (number of skipped results) of the call.
   * @return offset
   **/
  @ApiModelProperty(value = "The requested offset (number of skipped results) of the call.")
  
    @Valid
    public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }

  public CharacterDataContainer limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The requested result limit.
   * @return limit
   **/
  @ApiModelProperty(value = "The requested result limit.")
  
    @Valid
    public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public CharacterDataContainer total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of resources available given the current filter set.
   * @return total
   **/
  @ApiModelProperty(value = "The total number of resources available given the current filter set.")
  
    @Valid
    public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public CharacterDataContainer count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of results returned by this call.
   * @return count
   **/
  @ApiModelProperty(value = "The total number of results returned by this call.")
  
    @Valid
    public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public CharacterDataContainer results(List<java.lang.Character> results) {
    this.results = results;
    return this;
  }

  public CharacterDataContainer addResultsItem(java.lang.Character resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<java.lang.Character>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of characters returned by the call.
   * @return results
   **/
  @ApiModelProperty(value = "The list of characters returned by the call.")
      @Valid
    public List<java.lang.Character> getResults() {
    return results;
  }

  public void setResults(List<java.lang.Character> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterDataContainer characterDataContainer = (CharacterDataContainer) o;
    return Objects.equals(this.offset, characterDataContainer.offset) &&
        Objects.equals(this.limit, characterDataContainer.limit) &&
        Objects.equals(this.total, characterDataContainer.total) &&
        Objects.equals(this.count, characterDataContainer.count) &&
        Objects.equals(this.results, characterDataContainer.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterDataContainer {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
