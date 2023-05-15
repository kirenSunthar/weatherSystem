 public static String getSeason(String country, String month) {
        // Assume that seasons in countries in the Northern Hemisphere are opposite to those in the Southern Hemisphere
        String[] winterCountries = {"Canada", "Russia", "China", "Japan"};
        String[] summerCountries = {"Australia", "Brazil", "South Africa", "India"};
        String season;

        if (isInArray(winterCountries, country)) {
            season = "Winter";
        } else if (isInArray(summerCountries, country)) {
            season = "Summer";
        } else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
            season = "Winter";
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            season = "Spring";
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            season = "Summer";
        } else {
            season = "Fall";
        }

        return season;
    }
