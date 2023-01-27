
public class Parrot implements Bird {
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
        return "Colros: Yellow, Green";
    }

    @Override
    public String toString() {
        return "Analyzing Parrot: \n\tFlight: " + haveFlight() + "\n\tFeathers: " + haveFeathers()
                + "\n\t"
                + getColors();
    }

}
