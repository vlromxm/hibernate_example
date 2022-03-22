package com.hibernate;

import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

import java.util.List;
import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user",schema = "mydatabase")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "age")
    private Integer age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (name = "user_books",
            joinColumns={@JoinColumn(name="user_id")},
            inverseJoinColumns={@JoinColumn(name="book_id")})
    private List<Books> books;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", age=" + age+'}';
    }

    public User (String name, String surname, LocalDate date, Integer age){
        this.name=name;
        this.surname=surname;
        this.date=date;
        this.age=age;
    }
}
