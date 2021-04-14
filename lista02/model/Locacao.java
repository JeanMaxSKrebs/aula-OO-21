package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Locacao {
	private Integer id;
	private Calendar dataLocacao;
	private Calendar dataDevolucao;
	private Integer quilometragem;
	private Double valorCalcao;
	private Double valorLocacao;
	private Boolean devolvido;
	
	public Locacao() {
		super();
	}
	
	public Locacao(Integer id, Calendar dataLocacao, Calendar dataDevolucao,
		Integer quilometragem, Double valorCalcao, Double valorLocacao, Boolean devolvido) {
		super();
		this.id = id;
		this.dataLocacao = dataLocacao;
		this.dataDevolucao = dataDevolucao;
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

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
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
		return "Locacao [id=" + id + ", dataLocacao=" + calendarToString(dataLocacao)	+ ", dataDevolucao=" + calendarToString(dataDevolucao)  + ", quilometragem="
				+ quilometragem + ", valorCalcao=" + valorCalcao + ", valorLocacao=" + valorLocacao + ", devolvido="
				+ devolvido + "]\n";
	}
	
	private static String calendarToString(Calendar data) {
		if(data != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
			return sdf.format(data.getTime());
		}
		return "00/00/0000 00:00";
	}
}
