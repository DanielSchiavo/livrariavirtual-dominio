package modelo;

import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Usuario {

    private UUID id;

    private String nome;

    private String email;

    private List<Ebook> ebooks;
}
