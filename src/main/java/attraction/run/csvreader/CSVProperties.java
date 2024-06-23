package attraction.run.csvreader;

import attraction.run.newsletter.Category;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class CSVProperties {
  private final String thumbnailUrl;
  private final String name;
  private final String nickname;
  private final String email;
  private final String description;
  private final Category category;
  private final String mainLink;
  private final String subscribeLink;
  private final String uploadDays;
  private final String manager;
  private final String isAutoSubscribeEnabled;
  private final String hasConfirmationEmail;

  public CSVProperties(String[] line) {
    this.thumbnailUrl = line[0].length() > 255 ? "" : line[0];
    this.name = line[1];
    this.nickname = line[2];
    this.email = line[3];
    this.description = line[4];
    this.category = Category.findDayByViewName(line[5]);
    this.mainLink = line[6];
    this.subscribeLink = line[7];
    this.uploadDays = line[8];
    this.manager = line[9];
    this.isAutoSubscribeEnabled = line[10];
    this.hasConfirmationEmail = line[11];
  }

  public boolean isNotSkip() {
    return !category.isSkip();
  }

}
