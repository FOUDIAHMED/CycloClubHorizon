package ahmed.foudi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name ;

    @OneToMany(mappedBy="team")
    private Set<Cyclist> items;


    public Team() {

    }



}
