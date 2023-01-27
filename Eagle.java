public class Eagle implements Bird {

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
        return "Colros: Brown, White";
    }

    @Override
    public String toString() {
        return "Analyzing Eagle: \n\tFlight: " + haveFlight() + "\n\tFeathers: " + haveFeathers()
                + "\n\t"
                + getColors();
    }

}
