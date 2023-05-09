public class Woman extends Person {
    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public boolean isRetired() {
        return getAge() >= 60;
    }

    public void registerPartnership(Man partner) {
        setPartner(partner);
        setLastName(partner.getLastName());
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        Man partner = (Man) getPartner();
        setPartner(null);
        if (returnToPreviousLastName && partner != null) {
            setLastName(partner.getLastName());
        }
    }
}
