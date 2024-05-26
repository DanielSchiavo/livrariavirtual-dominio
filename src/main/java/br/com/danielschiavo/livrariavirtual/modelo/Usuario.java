package br.com.danielschiavo.livrariavirtual.modelo;

import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Usuario {

    private UUID id;

    private String nome;

    private String email;

    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    @Builder.Default
    private List<Ebook> ebooks = new ArrayList<>();

    public List<Ebook> getEbooks() {
        return Collections.unmodifiableList(this.ebooks);
    }

    public void adicionarEbook(Ebook ebook) {
        this.ebooks.add(ebook);
    }

    public void removerEbook(Ebook ebook) {
        this.ebooks.remove(ebook);
    }
}
