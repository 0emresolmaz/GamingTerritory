package Entities;

import Abstract.IEntity;

import java.time.LocalDate;

public class Gamer implements IEntity {
    public int id;
    public String firstName;
    public String lastName;
    public LocalDate DateOfBirth;
    public String nationalityId;
    public String nickName;
}
