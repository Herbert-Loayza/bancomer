package com.bamcom.homebanking.channel.user.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * UsersMenuResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-07T17:22:55.030Z[GMT]")


public class UsersMenuResponse   {
  @JsonProperty("menus")
  @Valid
  private List<Menu> menus = null;

  public UsersMenuResponse menus(List<Menu> menus) {
    this.menus = menus;
    return this;
  }

  public UsersMenuResponse addMenusItem(Menu menusItem) {
    if (this.menus == null) {
      this.menus = new ArrayList<Menu>();
    }
    this.menus.add(menusItem);
    return this;
  }

  /**
   * Get menus
   * @return menus
   **/
    public List<Menu> getMenus() {
    return menus;
  }

  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersMenuResponse usersMenuResponse = (UsersMenuResponse) o;
    return Objects.equals(this.menus, usersMenuResponse.menus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersMenuResponse {\n");
    
    sb.append("    menus: ").append(toIndentedString(menus)).append("\n");
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
