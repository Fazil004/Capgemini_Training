public class EarthVolume {
    public static void main(String[] args) {
        double earthRadiusKm = 6378.0;
        double earthRadiusMiles = earthRadiusKm * 0.621371;
        double pi = Math.PI;
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(earthRadiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(earthRadiusMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is "+ volumeKm +" and cubic miles is "+volumeMiles);
    }
}