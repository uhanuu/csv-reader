package attraction.run.newsletter.repository;

import attraction.run.newsletter.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepository extends JpaRepository<Newsletter, Long> {
}
