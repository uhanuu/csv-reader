package attraction.run.csvreader.controller;

import attraction.run.csvreader.CSVProperties;
import attraction.run.csvreader.CSVService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CSVController {
  private final CSVService csvService;

  @PostMapping("/csv")
  public void read() {
    List<CSVProperties> csvProperties = csvService.getCSVProperties();
    csvService.saveNewsLetter(csvProperties);
  }
}
