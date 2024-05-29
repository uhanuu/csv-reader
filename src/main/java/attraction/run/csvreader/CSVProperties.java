package attraction.run.csvreader;

import attraction.run.newsletter.Category;
import attraction.run.newsletter.UploadDays;
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
  private final UploadDays uploadDays;
  private final String manager;

  public CSVProperties(String[] line) {
    this.thumbnailUrl = line[0];
    this.name = line[1];
    this.nickname = line[2];
    this.email = line[3];
    this.description = line[4];
    this.category = Category.findDayByViewName(line[5]);
    this.mainLink = line[6];
    this.subscribeLink = line[7];
    this.uploadDays = UploadDays.findDayByViewName(line[8]);
    this.manager = line[9];
  }

  public boolean isNotSkip() {
    return !category.isSkip();
  }

}
