public class fallBackBird implements Bird{

    @Override
    public boolean haveFlight() {
        return true;
    }

    @Override
    public boolean haveFeathers() {
        return true;
    }

    @Override
    public String getColors() {
        return "Colors: Grey, White, Black";
    }

    @Override
    public String toString() {
        return "Analyzing fallback bird Pigeon: \n\tFlight: " + haveFlight() + "\n\tFeathers: " + haveFeathers()
                + "\n\t"
                + getColors();
    }
    
}
