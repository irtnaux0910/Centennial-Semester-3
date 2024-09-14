public class Singers {
    private int id;
    private String name;
    private String address;
    private String dateBirth;
    private int numberAlbums;

    public Singers() {
    }

    // 1 argument constructor
    public Singers(int id) {
        this.id = id;
    }

    // 2 argument constructor
    public Singers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 3 argument constructor
    public Singers(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // 4 argument constructor
    public Singers(int id, String name, String address, String dateBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateBirth = dateBirth;
    }
    public Singers(int id, String name, String address, String dateBirth, int numberAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateBirth = dateBirth;
        this.numberAlbums = numberAlbums;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public void SetName(String name) {
        this.name = name;
    }
    public void SetAddress(String address) {
        this.address = address;
    }

    public void SetDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void SetNumberOfAlbums(int numberAlbums) {
        this.numberAlbums = numberAlbums;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getDateBirth() {
        return dateBirth;
    }
    public int getNumberAlbums() {
        return numberAlbums;
    }
    public void setAllValues(int id, String name, String address, String dateBirth, int numberAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateBirth = dateBirth;
        this.numberAlbums = numberAlbums;
    }
}