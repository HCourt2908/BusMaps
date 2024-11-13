package org.example;
import com.google.maps.*;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.TravelMode;

public class test {

    public static void tester() {

        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(config.mapsAPIKey)
                .build();

        try {
            /*DirectionsResult result = DirectionsApi.newRequest(context)
                    .origin("Bristol, UK")
                    .destination("London, UK")
                    .mode(TravelMode.DRIVING)
                    .await();
*/
            DirectionsResult result2 = DirectionsApi.newRequest(context)
                        .origin("BS1 5RR")
                        .destination("BS30 8QD")
                        .mode(TravelMode.DRIVING)
                        .await();
/*
            double time1 = 1.0 * result.routes[0].legs[0].duration.inSeconds /3600;
            double hours1 = Math.floor(time1);
            double minutes1 = Math.floor((time1-hours1)*60);
*/
            double time2 = 1.0 * result2.routes[0].legs[0].duration.inSeconds /3600;
            double hours2 = Math.floor(time2);
            double minutes2 = Math.floor((time2-hours2)*60);
/*
            System.out.println("Driving from Bristol to London takes: " +
                    hours1 + " hours and " + minutes1 + " minutes.");
*/
            System.out.println("Driving from uni house to home takes: " +
                    hours2 + " hours and " + minutes2 + " minutes.");



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
