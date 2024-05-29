package attraction.run.newsletter;

import attraction.run.common.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Newsletter extends BaseTimeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String description;
  @Enumerated
  private Category category;
  @Column(name = "main_link")
  private String mainLink;
  @Column(name = "subscribe_link")
  private String subscribeLink;
  @Column(name = "thumbnail_url")
  private String thumbnailUrl;
  @Enumerated
  @Column(name = "upload_days")
  private UploadDays uploadDays;
  @Column(name = "is_deleted", nullable = false, columnDefinition = "TINYINT(1) default 0")
  private boolean isDeleted;

}
