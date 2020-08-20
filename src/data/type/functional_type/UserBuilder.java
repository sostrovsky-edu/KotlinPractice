package data.type.functional_type;

public class UserBuilder {
    String name = null;
    String address = null;
    String email = null;

    public void setName(final String name) { this.name = name; }

    public void setAddress(final String address) { this.address = address; }

    public void setEmail(final String email) { this.email = email; }

    public User build() {
        return new User(name, address, email);
    }
}
