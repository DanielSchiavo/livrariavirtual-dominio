package br.com.danielschiavo.livrariavirtual.modelo;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface RepositorioDeUsuario {

    public Usuario pegarUsuario() throws UsuarioNaoEncontradoException;

    public void cadastrarUsuario(Usuario usuario);


    public void adicionarEbook(List<Ebook> ebooks, String usuarioId);

    public void removerEbook(Ebook ebook, String usuarioId);

    List<Ebook> pegarEbookPorId(List<String> ebooksId, String usuarioId);
}
