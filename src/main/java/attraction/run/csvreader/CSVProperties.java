package attraction.run.csvreader;

import attraction.run.newsletter.Category;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CSVProperties {
  private final String email;
  private final String name;
  private final String description;
  private final String uploadDays;
  private final Category category;
  private final String mainLink;
  private final String subscribeLink;
  private final String thumbnailUrl;
  private final String nickname;
  private final String isAutoSubscribeEnabled;
  private final String hasConfirmationEmail;
  private final String isAgreePersonalInfoCollection;
  private final String isAgreeAdInfoReception;


  public CSVProperties(String[] line) {
    this.thumbnailUrl = line[0].length() > 255 ? "" : line[0].trim();
    this.name = line[1].trim();
    this.nickname = line[2].trim();
    this.email = line[3].trim();
    this.description = line[4].trim();
    this.category = Category.findDayByViewName(line[5].trim());
    this.mainLink = line[6].trim();
    this.subscribeLink = line[7].trim();
    this.uploadDays = line[8].trim();
    this.isAutoSubscribeEnabled = line[10].trim();
    this.hasConfirmationEmail = line[11].trim();
    this.isAgreePersonalInfoCollection = line[12].trim();
    this.isAgreeAdInfoReception = line[13].trim();
  }

  public boolean isNotSkip() {
    return !category.isSkip();
  }

}
