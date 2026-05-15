package br.com.sgci.factory.entity;

import java.util.Random;

import org.springframework.data.domain.Sort.Direction;

import br.com.sgci.controller.schema.EnderecoReq;
import br.com.sgci.controller.schema.EnderecoUpd;
import br.com.sgci.controller.schema.PessoaFilter;
import br.com.sgci.controller.schema.PessoaReq;
import br.com.sgci.controller.schema.PessoaUpd;
import br.com.sgci.model.Endereco;
import br.com.sgci.model.EstadoCivilEnum;
import br.com.sgci.model.Pessoa;
import br.com.sgci.model.TipoPessoaEnum;

public class PessoaFactory {

	public static Pessoa getPessoa(Endereco endereco) {
		return new Pessoa(endereco, "Pedro Factory", TipoPessoaEnum.PESSOA_FISICA, gerarCpfAleatorio(), "Pedreiro",
				EstadoCivilEnum.CASADO);
	}

	public static PessoaReq getPessoaReq(EnderecoReq enderecoReq, String documento) {
		return new PessoaReq("Pedro Factory", enderecoReq, TipoPessoaEnum.PESSOA_FISICA, gerarCpfAleatorio(),
				"Pedreiro", EstadoCivilEnum.CASADO);
	}

	private static String gerarCpfAleatorio() {
		Random random = new Random();
		int numeroNF = (random.nextInt(90000000) + 1000000);
		return String.valueOf(numeroNF);

	}

	public static PessoaUpd getPessoaUpd(EnderecoUpd endereco) {

		return new PessoaUpd("Pedro Factory", endereco, TipoPessoaEnum.PESSOA_FISICA, gerarCpfAleatorio(), "Pedreiro",
				EstadoCivilEnum.CASADO);

	}

	public static PessoaFilter getPessoaFilter(String cep) {
		PessoaFilter filtros = new PessoaFilter();

		filtros.setPage(0);
		filtros.setSize(1);
		filtros.setDirection(Direction.ASC);
		filtros.setOrdenarPor("nome");
		filtros.setCep(cep);

		return filtros;
		
	}
}
