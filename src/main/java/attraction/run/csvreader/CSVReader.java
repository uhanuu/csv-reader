package attraction.run.csvreader;

import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CSVReader {
  @Value("${csv.path}")
  private String path;

  public List<CSVProperties> readProperties(String filename) {
    try (com.opencsv.CSVReader csvReader = new com.opencsv.CSVReader(new FileReader(path + filename))) {
      skipFirstRow(csvReader);
      List<CSVProperties> properties = new ArrayList<>();

      String[] line;
      while ((line = csvReader.readNext()) != null) {
        properties.add(new CSVProperties(line));
      }

      return properties;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (CsvValidationException e) {
      throw new RuntimeException(e);
    }
  }

  private void skipFirstRow(com.opencsv.CSVReader csvReader) throws CsvValidationException, IOException {
    csvReader.readNext();
  }


}
