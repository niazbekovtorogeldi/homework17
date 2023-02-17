import java.util.Arrays;

public class Company {
    private String address;
    private Java[] javas;
    private Android[] androids;
    private Go[] gos;

    private String ownerName;

    public Company(String address, Java[] javas, Android[] androids, Go[] gos, String ownerName) {
        this.address = address;
        this.javas = javas;
        this.androids = androids;
        this.gos = gos;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getJavas() {
        return javas;
    }

    public void setJavas(Java[] javas) {
        this.javas = javas;
    }

    public Android[] getAndroids() {
        return androids;
    }

    public void setAndroids(Android[] androids) {
        this.androids = androids;
    }

    public Go[] getGos() {
        return gos;
    }

    public void setGos(Go[] gos) {
        this.gos = gos;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "\nCompany" +
                "\nAddress: " + address +
                "\nJavas: " + Arrays.toString(javas) +
                "\nAndroids: " + Arrays.toString(androids) +
                "\nGos: " + Arrays.toString(gos) +
                "\nOwnerName: " + ownerName +
                "\n";
    }
}