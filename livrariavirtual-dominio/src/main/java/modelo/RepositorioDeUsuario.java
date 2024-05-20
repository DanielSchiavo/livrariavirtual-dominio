package modelo;

import java.util.List;

public interface RepositorioDeUsuario {

    public List<Usuario> pegarTodosUsuarios();

    public void cadastrarUsuario(Usuario usuario);

    public void deletarUsuario(Usuario usuario) throws UsuarioNaoEncontradoException;

}
