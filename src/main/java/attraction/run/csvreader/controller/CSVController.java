package attraction.run.csvreader.controller;

import attraction.run.csvreader.CSVProperties;
import attraction.run.csvreader.CSVService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CSVController {
  private final CSVService csvService;

  @GetMapping("/csv")
  public void read() {
    List<CSVProperties> csvProperties = csvService.getCSVProperties();
    csvService.saveNewsLetter(csvProperties);
  }
}
