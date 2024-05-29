package attraction.run.newsletter;

import attraction.run.common.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Newsletter extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String email;

  private String name;
  private String description;
  @Enumerated(EnumType.STRING)
  private Category category;
  @Column(name = "main_link")
  private String mainLink;
  @Column(name = "subscribe_link")
  private String subscribeLink;
  private String nickname;
  @Column(name = "thumbnail_url")
  private String thumbnailUrl;
  @Enumerated(EnumType.STRING)
  @Column(name = "upload_days")
  private UploadDays uploadDays;
  @Column(name = "is_deleted", nullable = false, columnDefinition = "TINYINT(1) default 0")
  private boolean isDeleted;

  @Builder
  private Newsletter(
      String email,
      String name,
      String description,
      Category category,
      String mainLink,
      String subscribeLink,
      String thumbnailUrl,
      UploadDays uploadDays,
      String nickname
  ) {
    this.email = email;
    this.name = name;
    this.description = description;
    this.category = category;
    this.mainLink = mainLink;
    this.subscribeLink = subscribeLink;
    this.thumbnailUrl = thumbnailUrl;
    this.uploadDays = uploadDays;
    this.nickname = nickname;
  }
}
