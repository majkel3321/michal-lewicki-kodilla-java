package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.*;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateTemperaturesWithMock(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        HashMap<Integer,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0,25.2);
        temperaturesMap.put(1,22.4);
        temperaturesMap.put(2,24.7);
        temperaturesMap.put(3,23.8);
        temperaturesMap.put(4,26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5,quantityOfSensors);
    }


}
