package data.type.classes.type.data_class.example1;

public class MyPOJO {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        final MyPOJO myPOJO = (MyPOJO) obj;

        return value != null
                ? value.equals(myPOJO.value)
                : myPOJO == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MyPOJO {" +
                '\'' +value+ '\'' +
                '}';
    }
}
