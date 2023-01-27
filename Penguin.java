public class Penguin implements Bird {

    @Override
    public boolean haveFlight() {
        return false;
    }

    @Override
    public boolean haveFeathers() {
        return false;
    }

    @Override
    public String getColors() {
        return "Colros: Black, White";
    }

    @Override
    public String toString() {
        return "Analyzing fallback bird Pigeon: \n\tFlight: " + haveFlight() + "\n\tFeathers: " + haveFeathers()
                + "\n\t"
                + getColors();
    }

}
