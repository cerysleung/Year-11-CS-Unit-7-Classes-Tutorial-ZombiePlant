public class ZombiePlant {
    private int maxPotency;
    private int treatmentsRequired;

    //constructor
    public ZombiePlant (int maxPotency, int treatmentsRequired){
        this.maxPotency = maxPotency;
        this.treatmentsRequired = treatmentsRequired;
    }
    //getPotency
    public int getPotency () {
        return maxPotency;
    }
    //treatmentsNeeded
    public int treatmentsNeeded (){
        return treatmentsRequired;
    }
    //isDangerous
    public boolean isDangerous (){
        return treatmentsRequired > 0;
    }
    //treat
    public void treat (int potency) {
        if (potency <= maxPotency && potency > 0) {
            if (treatmentsRequired - 1 >= 0) {
                treatmentsRequired--;
            }else{
                treatmentsRequired = 0;
            }
        } else if (potency > maxPotency) {
            treatmentsRequired++;
        }
    }

}
