package attraction.run.newsletter;

import java.util.stream.Stream;

public enum AgreeAdInfoReceptionStatus {
  TRUE("있음", true),
  FALSE("없음", false);
  private final String viewName;
  private final boolean status;

  AgreeAdInfoReceptionStatus(String viewName, boolean status) {
    this.viewName = viewName;
    this.status = status;
  }

  public static boolean getStatus(String viewName) {
    return Stream.of(AgreeAdInfoReceptionStatus.values())
        .filter(v -> v.viewName.equals(viewName))
        .findAny()
        .orElse(FALSE)
        .status;
  }
}
