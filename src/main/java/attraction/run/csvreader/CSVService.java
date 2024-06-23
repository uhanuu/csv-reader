package attraction.run.csvreader;

import attraction.run.newsletter.NewsLetterFactory;
import attraction.run.newsletter.Newsletter;
import attraction.run.newsletter.service.NewsletterService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CSVService {
  public static final String FILE_NAME = "input.csv";
  private final CSVReader csvReader;
  private final NewsletterService newsletterService;

  public List<CSVProperties> getCSVProperties() {
    return csvReader.readProperties(FILE_NAME);
  }

  public void saveNewsLetter(List<CSVProperties> properties) {
    final List<Newsletter> newsletters = properties.stream()
        .filter(CSVProperties::isNotSkip)
        .map(NewsLetterFactory::getInstance)
        .toList();

    newsletterService.saveAllNewsletters(newsletters);
  }
}
