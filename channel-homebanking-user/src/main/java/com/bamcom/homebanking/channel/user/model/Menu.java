package com.bamcom.homebanking.channel.user.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Menu   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("icon")
  private String icon = null;

  public Menu code(String code) {
    this.code = code;
    return this;
  }

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Menu name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Menu Name
   * @return name
   **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Menu icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * menu icon
   * @return icon
   **/

    public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return Objects.equals(this.code, menu.code) &&
        Objects.equals(this.name, menu.name) &&
        Objects.equals(this.icon, menu.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
