package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Length;

    @Entity
    @Table(name = "categorias")
    @Getter
    @Setter
    @NamedQueries({
            @NamedQuery(name = "categorias.All",
                    query = "Select c from Categoria c")
})

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_categoria", length = 100, nullable = false)
    private String nombre;

    }