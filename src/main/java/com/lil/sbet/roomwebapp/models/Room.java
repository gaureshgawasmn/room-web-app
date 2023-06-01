package com.lil.sbet.roomwebapp.models;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="ROOM_NUMBER")
    private String number;
    @Column(name ="NAME")
    private String name;
    @Column(name ="BED_INFO")
    private String info;

    public Room() {
    }

    public Room(Long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public Room setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Room setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getName() {
        return name;
    }

    public Room setName(String name) {
        this.name = name;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Room setInfo(String info) {
        this.info = info;
        return this;
    }
}
