package ahmed.foudi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Team {

    @Column(name = "NAME")
    private String name ;

    @OneToMany(mappedBy = "")
    private List<Cyclist> members;
    public Team() {

    }



}
