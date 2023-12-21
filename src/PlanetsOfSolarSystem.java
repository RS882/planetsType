public enum PlanetsOfSolarSystem {
    MERCURY("Mercury", 2_439.7, 0.33011),
    VENUS("Venus", 6_051.8, 4.8675),
    EARTH("Earth", 6_371.0, 1),
    MARS("Mars", 3_389.5, 0.64171),
    JUPITER("Jupiter", 69_911, 317.83),
    SATURN("Saturn", 58_232, 95.162),
    URANUS("Uranus", 25_362, 14.536),
    NEPTUNE("Neptune", 24_622, 17.147),
    PLUTO("Pluto (dwarf planet)", 1_188.3, 0.00218);


   final private String name;
   final private double radius;
    final private double mass;

    PlanetsOfSolarSystem(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
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