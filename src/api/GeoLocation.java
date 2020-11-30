package api;

public class GeoLocation implements  geo_location{
    // 3 member x,y,z

    @Override
    public double x() {
        return 0;
    }

    @Override
    public double y() {
        return 0;
    }

    @Override
    public double z() {
        return 0;
    }

    @Override
    public double distance(geo_location g) {
        //return Math.sqrt(Math.pow((this.x - g.x()), 2) + Math.pow((this.y - g.y()), 2) + Math.pow((this.z - g.z()), 2));
        return 0;
    }
}
