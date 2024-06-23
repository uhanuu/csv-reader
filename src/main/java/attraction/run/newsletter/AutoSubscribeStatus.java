package attraction.run.newsletter;

import java.util.stream.Stream;

public enum AutoSubscribeStatus {
  TRUE("가능", true),
  FALSE("불가능", false);
  private final String viewName;
  private final boolean status;

  AutoSubscribeStatus(String viewName, boolean status) {
    this.viewName = viewName;
    this.status = status;
  }

  public static boolean getStatus(String viewName) {
    return Stream.of(AutoSubscribeStatus.values())
        .filter(v -> v.viewName.equals(viewName))
        .findAny()
        .orElse(FALSE)
        .status;
  }
}
