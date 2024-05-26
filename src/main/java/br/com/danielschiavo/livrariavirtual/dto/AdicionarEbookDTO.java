package br.com.danielschiavo.livrariavirtual.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AdicionarEbookDTO {

    private String nomeArquivo;

    private byte[] conteudo;

    private String senha;
}
