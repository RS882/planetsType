public enum PlanetsOfSolarSystem {
    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune"),
    PLUTO("Pluto (dwarf planet)");

   final private String name;

    PlanetsOfSolarSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static PlanetsOfSolarSystem getByPlanetIndex(int index) {
        return PlanetsOfSolarSystem.values()[index];
    }
}

//Mercury
//
//        Radius: 2,439.7 km
//        Mass: 0.33011 Earths
//        Venus
//
//        Radius: 6,051.8 km
//        Mass: 4.8675 Earths
//        Earth
//
//        Radius: 6,371.0 km
//        Mass: 1 Earth
//        Mars
//
//        Radius: 3,389.5 km
//        Mass: 0.64171 Earths
//        Jupiter
//
//        Radius: 69,911 km
//        Mass: 317.83 Earths
//        Saturn
//
//        Radius: 58,232 km
//        Mass: 95.162 Earths
//        Uranus
//
//        Radius: 25,362 km
//        Mass: 14.536 Earths
//        Neptune
//
//        Radius: 24,622 km
//        Mass: 17.147 Earths
//Pluto (dwarf planet)
//
//Radius: 1,188.3 km
//        Mass: 0.00218 Earths (Pluto has been reclassified as a dwarf planet and is not considered a planet)