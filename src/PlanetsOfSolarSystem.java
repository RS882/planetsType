public enum PlanetsOfSolarSystem {
    MERCURY("Mercury", 2_439.7, 0.055),
    VENUS("Venus", 6_051.8, 0.815),
    EARTH("Earth", 6_378.0, 1),
    MARS("Mars", 3_397, 0.107),
    JUPITER("Jupiter", 71_490, 317.83),
    SATURN("Saturn", 60_270, 95.162),
    URANUS("Uranus", 25_560, 14.536),
    NEPTUNE("Neptune", 24_760, 17.147),
    PLUTO("Pluto (dwarf planet)", 1_151, 0.00218);


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

    public  double getG() {
        final double G = 6.6743e-11;
        final double MASSOFEARTH = 5.972e24;
        return  G *getMass()* MASSOFEARTH /Math.pow(getRadius() * 1000, 2);
    }

    public static PlanetsOfSolarSystem getByPlanetIndex(int index) {
        return PlanetsOfSolarSystem.values()[index];
    }
}
