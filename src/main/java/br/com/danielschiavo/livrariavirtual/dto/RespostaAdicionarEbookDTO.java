package br.com.danielschiavo.livrariavirtual.dto;

import br.com.danielschiavo.livrariavirtual.modelo.Ebook;

import java.util.List;

public record RespostaAdicionarEbookDTO(
        List<Ebook> ebooksSucesso,
        List<Ebook> ebooksFalha
) {
}
