package com.mcmacken;

public class Main {
    public static void main(String[] args) {
        var cities = new USCities[] {
                new USCities("San Francisco", "37.77504090536313, -122.43142221512974"),
                new USCities("Seattle","47.60544476518461, -122.33224656162409"),
                new USCities("Chicago","41.87657541406594, -87.62279488063834"),
                new USCities("New York","40.71090440463151, -74.0078411719195"),
                new USCities("Washington DC","38.90735193805044, -77.03277409617155")
        };

        Layer<USCities> citiesLayer = new Layer<>(cities);
        citiesLayer.renderLayer();

        var interstates = new USInterstates[] {
                new USInterstates("I-80", "37.803702, -122.371313",
                        "39.536769, -119.786779",
                        "40.76140936002684, -111.90401325624426",
                        "41.226614425723376, -95.95440873085907",
                        "41.578522, -87.674934",
                        "40.864251, -74.014980")
        }
    }
}
