package attraction.run.newsletter;

import java.util.stream.Stream;
import lombok.Getter;

@Getter
public enum Category {
  SKIP("기타"),
  TREND_LIFE("트렌드/라이프"),
  ENTERTAINMENT("엔터테인먼트"),
  BUSINESS_FINANCIAL_TECHNOLOGY("비즈/재테크"),
  LOCAL_TRAVEL("지역/여행"),
  FOOD("푸드"),
  IT_TECH("IT/테크"),
  DESIGN("디자인"),
  CURRENT_AFFAIRS_SOCIETY("시사/사회"),
  HOBBY_SELF_DEVELOPMENT("취미/자기개발"),
  CULTURE_ART("문화/예술"),
  LIVING_INTERIOR("리빙/인테리어"),
  ECONOMY("경제");

  private final String viewName;

  Category(String viewName) {
    this.viewName = viewName;
  }

  public static Category findDayByViewName(String viewName) {
    return Stream.of(values())
        .filter(day -> day.viewName.equals(viewName))
        .findAny()
        .orElse(SKIP);
  }

  public boolean isSkip() {
    return this == SKIP;
  }
}
