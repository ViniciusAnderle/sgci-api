package br.com.sgci.factory.entity;

import br.com.sgci.controller.schema.EnderecoReq;
import br.com.sgci.controller.schema.EnderecoUpd;
import br.com.sgci.model.Endereco;

public class EnderecoFactory {

	public static Endereco getEndereco() {
		return new Endereco("12345567", "PR", "Ponta Grossa", "Rua sabe Deus", "Centro", 123);
	}

	public static EnderecoReq getEnderecoReq() {
		return new EnderecoReq("12345567", "PR", "Ponta Grossa", "Rua sabe Deus", "Centro", 123);
	}

	public static EnderecoUpd getEnderecoUpd() {
		return new EnderecoUpd("12345567", "PR", "Ponta Grossa", "Rua sabe Deus", "Centro", 123);

	}
}
