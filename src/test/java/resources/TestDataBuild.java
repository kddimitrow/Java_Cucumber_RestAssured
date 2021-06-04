package resources;

import SerializationAndDeserialization.AddPlace;
import SerializationAndDeserialization.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

        public AddPlace addPlacePayLoad(String name, String language, String address){

            AddPlace addPlaceClassObj = new AddPlace();


            addPlaceClassObj.setAccuracy(50);
            addPlaceClassObj.setAddress(address);
            addPlaceClassObj.setLanguage(language);
            addPlaceClassObj.setPhone_number("(983 893 3937");
            addPlaceClassObj.setWebsite("https://rahulshettyacademy.com");
            addPlaceClassObj.setName(name);


            // addPlaceClassObj.setLocation().set(-38.383494));
            // addPlaceClassObj.getLocation().setLng(33.427362);

            Location locationObj = new Location();
            locationObj.setLng(-38.383494);
            locationObj.setLat(33.427362);
            addPlaceClassObj.setLocation(locationObj); // we should also set it through the AddPlace class


            List<String> myList = new ArrayList<>();
            myList.add("shoe park");
            myList.add("shop");
            addPlaceClassObj.setTypes(myList);

            return addPlaceClassObj;

        }

}
