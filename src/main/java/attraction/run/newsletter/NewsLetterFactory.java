package attraction.run.newsletter;

import attraction.run.csvreader.CSVProperties;

public final class NewsLetterFactory {
  private NewsLetterFactory() {
  }

  public static Newsletter getInstance(CSVProperties properties) {

    return Newsletter.builder()
        .email(properties.getEmail())
        .name(properties.getName())
        .description(properties.getDescription())
        .category(properties.getCategory())
        .mainLink(properties.getMainLink())
        .subscribeLink(properties.getSubscribeLink())
        .thumbnailUrl(properties.getThumbnailUrl())
        .uploadDays(properties.getUploadDays())
        .nickname(properties.getNickname())
        .isAutoSubscribeEnabled(AutoSubscribeStatus.getStatus(properties.getIsAutoSubscribeEnabled()))
        .hasConfirmationEmail(ConfirmationEmailStatus.getStatus(properties.getHasConfirmationEmail()))
        .build();
  }
}
