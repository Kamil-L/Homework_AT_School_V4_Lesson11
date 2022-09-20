package models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    public EnvironmentModel test;
    public EnvironmentModel preprod;

    @JsonAnyGetter
    public EnvironmentModel getTest() {
        return test;
    }

    @JsonAnyGetter
    public EnvironmentModel getPreprod() {
        return preprod;
    }

    @JsonAnyGetter
    public List<EnvironmentModel> getListOfEnvironments() {
        List<EnvironmentModel> listOfEnvironments = new ArrayList<>();
        listOfEnvironments.add(getTest());
        listOfEnvironments.add(getPreprod());
        return listOfEnvironments;
    }
}
