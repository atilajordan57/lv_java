package lv.com.virtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lv.com.virtual.controller.AcessoController;
import lv.com.virtual.model.Acesso;
import lv.com.virtual.repository.AcessoRepository;
import lv.com.virtual.service.AcessoService;

@SpringBootTest(classes = LvJavaApplication.class)
public class LvJavaApplicationTests {

	//@Autowired
	//private AcessoService acessoService;
	
	//@Autowired
	//private AcessoRepository acessoRepository;

	@Autowired
	private AcessoController acessoController;
	
	@Test
	public void testeCadastroAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ROOT");
		
		acessoController.salvarAcesso(acesso);
	}

}
