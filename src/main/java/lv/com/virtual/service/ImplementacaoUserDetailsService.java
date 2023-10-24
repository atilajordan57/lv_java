package lv.com.virtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lv.com.virtual.model.Usuario;
import lv.com.virtual.repository.UsuarioRepository;

@Service
public class ImplementacaoUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
		/* instancia e chama o repository com o metodo lá de busca por login*/
		Usuario usuario = usuarioRepository.findUserByLogin(username);
		
		/* faz validacao*/
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário não foi encontrado");
		}
		
		/* aqui da o retorno*/
		return new User(usuario.getLogin(), usuario.getPassword(), usuario.getAuthorities());
	}

	
	
}
