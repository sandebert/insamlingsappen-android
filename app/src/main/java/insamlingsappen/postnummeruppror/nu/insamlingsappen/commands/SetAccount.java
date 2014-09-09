package insamlingsappen.postnummeruppror.nu.insamlingsappen.commands;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.StringWriter;

/**
 * Created by kalle on 07/09/14.
 */
public class SetAccount extends PostJsonToServerCommand {

  private String identity;
  private String emailAddress;
  private String firstName;
  private String lastName;
  private Boolean acceptingCcZero;

  public SetAccount() {
  }

  @Override
  protected String postUrlPathFactory() {
    return "/api/account/set";
  }

  @Override
  protected void assembleRequestJson(JSONObject json) throws JSONException {
    json.put("identity", identity);
    json.put("emailAddress", emailAddress);
    json.put("acceptingCcZero", acceptingCcZero);
    json.put("firstName", firstName);
    json.put("lastName", lastName);
  }

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Boolean getAcceptingCcZero() {
    return acceptingCcZero;
  }

  public void setAcceptingCcZero(Boolean acceptingCcZero) {
    this.acceptingCcZero = acceptingCcZero;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
