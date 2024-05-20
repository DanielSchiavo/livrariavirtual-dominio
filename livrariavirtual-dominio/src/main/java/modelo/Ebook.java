package modelo;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Ebook {

    private UUID id;

    private String nome;

    private String nomeArquivo;

    private byte[] imagemCapa;

    private Integer paginaAtual;

    private LocalDateTime dataEHoraAdicao;

    private String senhaDoEbook;

}
