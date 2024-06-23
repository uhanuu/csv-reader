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

  @Column(nullable = false, length = 100)
  private String email;

  @Column(nullable = false, length = 30)
  private String name;

  @Column(nullable = false)
  private String description;

  @Column(nullable = false)
  private String uploadDays;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Category category;

  @Column(nullable = false)
  private String mainLink;

  @Column(nullable = false)
  private String subscribeLink;

  @Column(nullable = false)
  private String thumbnailUrl;

  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
  private boolean isAutoSubscribeEnabled = false;

  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
  private boolean hasConfirmationEmail = false;

  private String nickname;

  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
  private boolean isDeleted = false;

  @Builder
  private Newsletter(Long id, String email, String name, String description, String uploadDays, Category category,
                    String mainLink, String subscribeLink, String thumbnailUrl, boolean isAutoSubscribeEnabled,
                    boolean hasConfirmationEmail, String nickname, boolean isDeleted) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.description = description;
    this.uploadDays = uploadDays;
    this.category = category;
    this.mainLink = mainLink;
    this.subscribeLink = subscribeLink;
    this.thumbnailUrl = thumbnailUrl;
    this.isAutoSubscribeEnabled = isAutoSubscribeEnabled;
    this.hasConfirmationEmail = hasConfirmationEmail;
    this.nickname = nickname;
    this.isDeleted = isDeleted;
  }
}
