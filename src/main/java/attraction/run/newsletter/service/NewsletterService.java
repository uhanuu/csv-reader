package attraction.run.newsletter.service;

import attraction.run.newsletter.Newsletter;
import attraction.run.newsletter.repository.NewsletterRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsletterService {
  private final NewsletterRepository newsletterRepository;

  public void saveAllNewsletters(List<Newsletter> newsletters) {
    newsletterRepository.saveAll(newsletters);
  }
}
