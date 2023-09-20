package lv.com.virtual.enums;

public enum StatusContaPagar {

	COBRANCA("PAGAR"), 
	VENCIDA("VENCIDA"), 
	ABERTA("ABERTA"), 
	QUITADA("QUITADA"),
	NEGOCIADA("RENEGOCIADA");

	private String descricao;

	private StatusContaPagar(String descricao) {
		this.descricao = descricao;

	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {

		return this.getDescricao();
	}
	
	
}