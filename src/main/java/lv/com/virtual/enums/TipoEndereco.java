package lv.com.virtual.enums;

public enum TipoEndereco {
/*cria este enum e mapeia na classe endereco*/
	COBRANCA("Cobrança"),
	ENTREGA("Entrega");
	
	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {

		return this.toString();
	}
	
	
}
