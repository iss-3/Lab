package ro.blooddonation.Domain;


public class Hospital {

    private Address address;
    private Long id;
    private static Long idGen = Long.valueOf(1);

    /**
     * @param address: Address
     */
    public Hospital(Address address)
    {
        this.address = address;
        this.id = idGen;
        idGen += 1;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }
}