package model;

import java.util.Calendar;

public class Locacao {
	private Integer id;
	private Calendar dataLocacao;
	private Calendar horaLocacao;
	private Calendar dataDevolucao;
	private Calendar horaDevolucao;
	private Integer quilometragem;
	private Double valorCalcao;
	private Double valorLocacao;
	private Boolean devolvido;
	
	public Locacao() {
		super();
	}
	
	public Locacao(Integer id, Calendar dataLocacao, Calendar horaLocacao, Calendar dataDevolucao,
			Calendar horaDevolucao, Integer quilometragem, Double valorCalcao, Double valorLocacao, Boolean devolvido) {
		super();
		this.id = id;
		this.dataLocacao = dataLocacao;
		this.horaLocacao = horaLocacao;
		this.dataDevolucao = dataDevolucao;
		this.horaDevolucao = horaDevolucao;
		this.quilometragem = quilometragem;
		this.valorCalcao = valorCalcao;
		this.valorLocacao = valorLocacao;
		this.devolvido = devolvido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Calendar getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Calendar dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Calendar getHoraLocacao() {
		return horaLocacao;
	}

	public void setHoraLocacao(Calendar horaLocacao) {
		this.horaLocacao = horaLocacao;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Calendar getHoraDevolucao() {
		return horaDevolucao;
	}

	public void setHoraDevolucao(Calendar horaDevolucao) {
		this.horaDevolucao = horaDevolucao;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Double getValorCalcao() {
		return valorCalcao;
	}

	public void setValorCalcao(Double valorCalcao) {
		this.valorCalcao = valorCalcao;
	}

	public Double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(Double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public Boolean getDevolvido() {
		return devolvido;
	}

	public void setDevolvido(Boolean devolvido) {
		this.devolvido = devolvido;
	}


	@Override
	public String toString() {
		return "Locacao [id=" + id + ", dataLocacao=" + dataLocacao + ", horaLocacao=" + horaLocacao
				+ ", dataDevolucao=" + dataDevolucao + ", horaDevolucao=" + horaDevolucao + ", quilometragem="
				+ quilometragem + ", valorCalcao=" + valorCalcao + ", valorLocacao=" + valorLocacao + ", devolvido="
				+ devolvido + "]\n";
	}
}
