public class Man extends Person {
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public boolean isRetired() {
        return getAge() >= 65;
    }

    public void registerPartnership(Woman partner) {
        setPartner(partner);
        partner.setLastName(getLastName());
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        Woman partner = (Woman) getPartner();
        setPartner(null);
        if (returnToPreviousLastName && partner != null) {
            setLastName(partner.getLastName());
        }
    }
}
