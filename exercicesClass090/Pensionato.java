package exercicesClass90;

public class Pensionato {
    private String name;
    private String mail;
    private int room;

    public Pensionato (String name, String mail, int room) {
        this.name = name;
        this.mail = mail;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return String.format("%d: %s, %s", getRoom(), getName(), getMail());
    }
}
