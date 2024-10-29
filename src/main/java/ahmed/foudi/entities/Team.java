package ahmed.foudi.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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

    @OneToMany(mappedBy="team", fetch = FetchType.EAGER)
    private Set<Cyclist> cyclists;


    public Team() {
    }





}
