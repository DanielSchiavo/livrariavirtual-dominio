package br.com.danielschiavo.livrariavirtual.modelo;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Ebook {

    private UUID id;

    private String nome;

    private String nomeArquivo;

    private byte[] imagemCapa;

    private byte[] conteudo;

    private Integer paginaAtual;

    private LocalDateTime dataEHoraAdicao;

    private String senhaDoEbook;

}
