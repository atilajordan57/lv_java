package lv.com.virtual.enums;

public enum StatusContaReceber {

	COBRANCA("pAGAR"), 
	VENCIDA("pAGAR"), 
	ABERTA("pAGAR"), 
	QUITADA("pAGAR");

	private String descricao;

	private StatusContaReceber(String descricao) {
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