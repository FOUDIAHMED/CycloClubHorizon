package ahmed.foudi.dao.interfaces;

import ahmed.foudi.entities.Result;
import ahmed.foudi.entities.Stage;

import java.util.List;

public interface ResultInterface {
    List<Result> findResultsByStage(Stage stage);
}
