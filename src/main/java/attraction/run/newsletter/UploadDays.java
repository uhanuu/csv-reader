package attraction.run.newsletter;

import java.util.stream.Stream;
import lombok.Getter;

@Getter
public enum UploadDays {
  ETC("기타"),
  MON("월"),
  TUE("화"),
  WED("수"),
  THU("목"),
  FRI("금"),
  SAT("토"),
  SUN("일");

  private final String viewName;

  UploadDays(String viewName) {
    this.viewName = viewName;
  }

  public static UploadDays findDayByViewName(String viewName) {
    return Stream.of(values())
        .filter(day -> day.viewName.equals(viewName))
        .findAny()
        .orElse(ETC);
  }
}
