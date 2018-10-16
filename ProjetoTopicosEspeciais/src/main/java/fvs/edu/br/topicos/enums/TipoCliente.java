package fvs.edu.br.topicos.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1),
	PESSOAJURIDICA(2);
	
	int tipoPessoa;
	
	TipoCliente(int tippoPessoa){
		this.tipoPessoa = tipoPessoa;
	}

	
}
