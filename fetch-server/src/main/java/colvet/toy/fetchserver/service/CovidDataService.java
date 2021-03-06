package colvet.toy.fetchserver.service;

import colvet.toy.fetchserver.model.GubunResponseModel;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;
import java.text.ParseException;

public interface CovidDataService{
    
    void fetchAndSaveCovidData() throws IOException, ParseException;
    GubunResponseModel getCovidDataByGubunAndToday(String gubun);

}
