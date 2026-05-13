package br.com.sgci.controller.schema;

import java.util.List;

public class PessoaListResponse {

	private List<PessoaResponse> data;
	private Long totalRecords;
	private int totalPages;
	private int pageSize;

	public List<PessoaResponse> getData() {
		return data;
	}

	public void setData(List<PessoaResponse> data) {
		this.data = data;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}