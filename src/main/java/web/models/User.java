package web.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_lastname")
    private String lastName;

    @Column(name = "user_age")
    private byte age;

    public User() { }

    public User(String name, String lastName, byte age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return this.age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nId: " + getId() + "\nName: " + getName()
                + "\nLastName: " + getLastName() + "\nAge: " + getAge();
    }
}
